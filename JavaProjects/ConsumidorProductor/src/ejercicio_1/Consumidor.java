/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvarohf
 */
public class Consumidor extends Thread {

    //Declaracion de variables
    private Buffer buf;
    private String nombre;

    public Consumidor(Buffer buf, String nombre) {
        this.buf = buf;
        this.nombre=nombre;
    }
    //Metodo para los hilos que leera los mensajes del buffer
    @Override
    public void run() {
        //Sera un bucle infinito para que este siempre leyendo
        while(true) {
             try {
                    sleep((int)(300+300*Math.random()));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
             //Se muestran por pantalla
             System.out.println(nombre+" lee mensaje:"+ buf.recibeDatos());
            
        }
    }

}
