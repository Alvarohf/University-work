/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Alvarohf
 */
public class Buffer {
    //Declaramos las variables
    private String mensaje;
    //El array sera nuestro buffer para guardar hasta 40 mensajes
    private ArrayList<String> cola = new ArrayList<>(40);
    //Creamos el lock y las conditions para el acceso seguro a la zona compartida
    // de codigo
    private Lock cerrojo = new ReentrantLock();
    private Condition bLleno = cerrojo.newCondition();
    private Condition bVacio = cerrojo.newCondition();
    //Booleano que indicara si esta lleno nuestro array
    private boolean lleno = false;
    /**
     * Lee el mensaje y lo almacena en una variable
     * @param msg (String) mensaje que es enviado
     */
    public void enviaDatos(String msg) {
        try {
            //Bloqueamos una vez se quiere enviar datos
            cerrojo.lock();
            //En caso de que este lleno espera a que se vacie
            while (cola.size() >= 40) {
               try {
                    bLleno.await();
                } catch (InterruptedException ex) {
                   System.out.println("Error espera lleno: "+ex);
                }
            }
            //Añade un mensaje nuevo al array
            cola.add(msg);
            //En caso de que haya algun hilo esperando lo despierta
            bVacio.signal();
        } catch (Exception e) {
            System.out.println("Error al enviar: "+e);
        } finally {
            //Desbloqueamos el recurso
            cerrojo.unlock();
        }
    }
    /**
     * Devuelve el mensaje al consumidor
     * @return (String) devuelve el primer mensaje del array
     */
    public String recibeDatos() {
        
        try {
            //Bloqueamos para recibir los datos
            cerrojo.lock();
            //En caso de que este vacio se espera a que haya mensajes
            while (cola.isEmpty()) {
                try {
                    bVacio.await();
                } catch (InterruptedException ex) {
                    System.out.println("Error espera vacio: "+ex);
                }
            }
            //Obtenemos el primer mensaje del array
            mensaje = cola.get(0);
            //Lo eliminamos
            cola.remove(mensaje);
            //Despertamos a los productores que esten esperando
            bLleno.signal();
            //Devolvemos mensaje
            return mensaje;

        } catch (Exception e) {
            System.out.println("Error al recibir: "+e);
        } finally {
            //Desbloqueamos el lock
            cerrojo.unlock();
        }
        //Nunca se llegara a este return pero es necesario ponerlo para evitar errores
        return mensaje;
    }
}
