/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class Servidor extends Thread {

    //Declaracion de variables
    private String mensaje = "";
    private int maximoClientes = 0;
    private boolean salir = false, nuevoMensaje = false;
    //Parte relativa a sistemas distribuidos
    private ServerSocket servidor;
    private Socket conexion;
    //Array donde guardaremos los clientes segun lleguen
    //Volatile para que tenga en cuenta que se actualiza la lista
    private volatile ArrayList<MultiCliente> mult = new ArrayList<>();

    /**
     * Constructor de la clase
     *
     * @param maximoClientes (int) numero maximo de clientes simultaneos
     */
    public Servidor(int maximoClientes) {
        this.maximoClientes = maximoClientes;
    }

    @Override
    public void run() {

        try {
            //Se crea el server socket en el puerto 5000
            servidor = new ServerSocket(5000);
            //Mensaje de inicio
            System.out.println("SERVIDOR INICIADO");
            while (true) {
                //Si es menor que el numero maximo de conexiones la acepta
                if (mult.size() < maximoClientes) {
                    conexion = servidor.accept();
                    //Añade el nuevo cliente y lo lanza
                    mult.add(new MultiCliente(this));
                    mult.get(mult.size() - 1).start();
                    //Se aumenta en un uno el numero de clientes que estan usandolo
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //No cerramos la conexion porque esta en un bucle infinito y se cerrara
        // solo cuando el sistema haga exit
    }

    /**
     * Actualiza los mensajes tanto del servidor como de multicliente
     *
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        //Tambien actualizamos los de la clase principal por si
        // un cliente se conecte mas tarde el mensaje este actualizado
        this.mensaje = mensaje;
        nuevoMensaje = true;
        //Actualizamos el mensaje en todos los clientes
        for (int i = 0; i < mult.size(); i++) {
            if (mult.get(i) != null) {
                mult.get(i).setMensaje(mensaje);
            }
        }
    }

    /**
     * Avisa si el sistema ha terminado de procesar los datos
     *
     * @param salir (boolean) True si el sistema ha finalizado y sale
     */
    public void setSalir(boolean salir) {

        this.salir = salir;

        //Actualizamos el mensaje en todos los clientes
        for (int i = 0; i < mult.size(); i++) {
            if (mult.get(i) != null) {
                mult.get(i).setSalir(salir);
            }
        }
    }
    /**
     * Quita un cliente que se ha desconectado para atender a mas
     * @param multicliente (Multicliente) hilo del servidor que sera eliminado
     */
    public void quitarCliente(MultiCliente multicliente) {
        mult.remove(multicliente);
    }
    //Getters
    public String getMensaje() {
        return mensaje;
    }

    public boolean isSalir() {
        return salir;
    }

    public boolean isNuevoMensaje() {
        return nuevoMensaje;
    }

    public Socket getConexion() {
        return conexion;
    }

    public ArrayList<MultiCliente> getMult() {
        return mult;
    }
    
}
