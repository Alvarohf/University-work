/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JTextField;

/**
 *
 * @author Alvarohf
 */
public class Buffer {
    //Declaracion de variables
    private Paso pasoProd=new Paso();
    private Paso pasoCons=new Paso();
    private JTextField texto;
    private String mensaje;
    //Declaracion del array de tamaño 40
    private ArrayList<String> cola = new ArrayList<>(40);
    //Declaramos el cerrojo y sus conditions
    private Lock cerrojo = new ReentrantLock();
    private Condition bLleno = cerrojo.newCondition();
    private Condition bVacio = cerrojo.newCondition();
    private boolean lleno = false;
    /**
     * Constructor que recibe el textfield a modificar
     * @param texto (JTextField) Campo de texto que mostrara el array
     */
    public Buffer(JTextField texto) {
        this.texto = texto;
    }
    /**
     * Lee el mensaje y lo almacena en una variable
     * @param msg (String) mensaje que es enviado
     */
    public void enviaDatos(String msg) {
        try {
            //Antes bloquearlo miramos si lo ha parado el usuario
            pasoProd.mirar();
            //Bloqueamos
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
            //Actualiza el buffer en la interfaz grafica
            mostrarBuffer(texto);     
        } catch (Exception e) {
            System.out.println("Error al enviar: "+e);
        } finally {
            //Desbloqueamos el recurso
            cerrojo.unlock();
        }
    }

    public String recibeDatos() {

        try {
            //Antes bloquearlo miramos si lo ha parado el usuario
            pasoCons.mirar();
            cerrojo.lock();
            
            while (cola.isEmpty()) {
                try {
                    bVacio.await();
                } catch (InterruptedException ex) {
                }
            }
            //Obtenemos el primer mensaje del array
            mensaje = cola.get(0);
            //Lo eliminamos
            cola.remove(mensaje);
            //Despertamos a los productores que esten esperando
            bLleno.signal();
            //Actualiza el buffer en la interfaz grafica
            mostrarBuffer(texto);
            //Devuelve el mensaje
            return mensaje;
        } catch (Exception e) {
        } finally {
            //Desbloqueamos el recurso
            cerrojo.unlock();
        }
        //Nunca se llegara a este return pero es necesario ponerlo para evitar errores
        return mensaje;
    }
    /**
     * Devuelve el objeto paso del productor
     * @return (Paso) Objeto de la clase paso
     */
    public Paso getPasoProd() {
        return pasoProd;
    }
    /**
     * Devuelve el objeto paso del consumidor
     * @return (Paso) Objeto de la clase paso
     */
    public Paso getPasoCons() {
        return pasoCons;
    }
    /**
     * Actualiza el textfield de la interfaz
     * @param texto (JTextField) JTextField a modificar
     */
    public void mostrarBuffer(JTextField texto) {
        texto.setText(Arrays.toString(cola.toArray()));
    }

}
