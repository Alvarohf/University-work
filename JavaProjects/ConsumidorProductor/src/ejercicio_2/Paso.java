/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Alvarohf
 */
public class Paso {

    private boolean cerrado = false;
    private Lock cerrojo = new ReentrantLock();
    private Condition parar = cerrojo.newCondition();
    /**
     * Comprueba si esta cerrado si lo esta se espera
     */
    public void mirar() {
        try {
            cerrojo.lock();
            while (cerrado) {
                try {
                    parar.await();
                } catch (InterruptedException ie) {
                    System.out.println("Error al esperar en paso: "+ie);
                }
            }
        }catch (Exception e){
            System.out.println("Error al mirar: "+e);
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
