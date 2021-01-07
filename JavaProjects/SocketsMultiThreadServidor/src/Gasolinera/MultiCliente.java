/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class MultiCliente extends Thread {

    //Declaracion de variables
    private String mensaje = "";
    private boolean salir = false, nuevoMensaje = false;
    //Parte relativa a sistemas distribuidos
    private Socket conexion;
    private DataOutputStream salida;
    private Servidor servidor;
    private Semaphore sem = new Semaphore(1);

    /**
     * Constructor clase multicliente
     *
     * @param servidor (Servidor) Objeto que contendrá todo lo necesario para la
     * conexion
     */
    public MultiCliente(Servidor servidor) {

        //Inicializacion con los valores del constructor
        conexion = servidor.getConexion();
        this.salir = servidor.isSalir();
        this.nuevoMensaje = servidor.isNuevoMensaje();
        this.mensaje = servidor.getMensaje();
        this.servidor = servidor;
    }

    @Override
    public void run() {
        try {
            while (!salir) {
                try {
                    sem.acquire();
                    //Creamos la salida de datos
                    salida = new DataOutputStream(conexion.getOutputStream());
                    if (salir) {
                        try {
                            //Entonces escribe salir para avisar al cliente
                            salida.writeUTF("salir");
                        } catch (IOException ex) {
                            Logger.getLogger(MultiCliente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    //Si hay un nuevo mensaje que llega
                    if (nuevoMensaje) {
                        //Vuelve a poner a false porque va a procesar el mensaje
                        nuevoMensaje = false;
                        //Manda el mensaje por el stream
                        try {
                            salida.writeUTF(mensaje);
                        } catch (java.net.SocketException ex) {
                            servidor.quitarCliente(this);
                            salir = true;
                        } catch (IOException ex) {
                            Logger.getLogger(MultiCliente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(MultiCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } finally {
            try {
                //Cerramos la conexion y stream
                System.out.println("CIERRE DE UNA CONEXION");
                salida.close();
                conexion.close();
            } catch (IOException ex) {
                Logger.getLogger(MultiCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Actualiza el anterior mensaje con el que recibe
     *
     * @param mensaje (String) Mensaje recibido con nuevos datos
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        nuevoMensaje = true;
        sem.release();
    }

    /**
     * Indica si el sistema a finalizado
     *
     * @param salir (boolean) Estado de si el sistema ha finalizado
     */
    public void setSalir(boolean salir) {
        this.salir = salir;
        sem.release();

    }
}
