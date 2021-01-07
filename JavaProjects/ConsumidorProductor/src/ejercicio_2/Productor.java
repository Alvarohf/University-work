/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alvarohf
 */
public class Productor extends Thread {

    //Declaracion de variables
    private Buffer buf;
    private char letra;
    private int nMensajes;
    //Constructor de la clase que recibe el numero de mensajes
    //y la letra del productor
    /**
     * 
     * @param buf (Buffer) Buffer que comparte con los consumidores
     * @param nMensajes (int) Numero de mensajes que enviará
     * @param letra (char) Letra asociada al productor
     */
    public Productor(Buffer buf, int nMensajes, char letra) {
        this.nMensajes = nMensajes;
        this.buf = buf;
        this.letra = letra;
    }
    //Método que se ejecutará en cada hilo
    @Override
    public void run() {
            //Genera el numero de mensajes introducido en el constructor
            for (int i = 0; i < nMensajes; i++) {

                try {
                    //Los envía entre 0,4 y 0,8 segundos
                    sleep((int)(400+400*Math.random()));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Mensaje compuesto de letra mas numero de mensaje
                buf.enviaDatos(letra + "" + i);
                

            }
       
    }
}