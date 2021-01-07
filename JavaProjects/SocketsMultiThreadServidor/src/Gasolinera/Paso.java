/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class Paso {
    //Declaracion de variables
    private boolean cerrado = false;
    private Lock cerrojo = new ReentrantLock();
    private Condition parar = cerrojo.newCondition();
    /**
     * Comprueba si esta cerrado si lo esta espera entonces
     */
    public void mirar() {
        try {
            //Bloqueamos cada vez que usamos el metodo
            cerrojo.lock();
            //El bucle sera el encargado de parar a todos hasta que se llame a abrir
            while (cerrado) {
                try {
                    parar.await();
                } catch (InterruptedException ie) {
                    ie.printStackTrace(System.err);
                }
            }
        //Mostramos los errores en el standard error
        }catch (Exception e){
            e.printStackTrace(System.err);
        } finally {
            cerrojo.unlock();
        }
    }
    /**
     * Desbloquea en caso de que este cerrado
     */
    public void abrir() {
        try {
            cerrojo.lock();
            cerrado = false;
            parar.signalAll();
        } finally {
            cerrojo.unlock();
        }
    }
    /**
     * Bloquea en caso de que este abierto
     */
    public void cerrar() {
        try {
            cerrojo.lock();
            cerrado = true;
            parar.signalAll();
        } finally {
            cerrojo.unlock();
        }

    }

}
