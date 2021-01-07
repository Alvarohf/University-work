
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alvar
 */
public class Paso {

    private boolean cerrado = false;
    private Lock cerrojo = new ReentrantLock();
    private Condition parar = cerrojo.newCondition();
    public void mirar() throws RemoteException  {
        try {
            cerrojo.lock();
            while (cerrado) {
                try {
                    parar.await();
                } catch (InterruptedException ie) {
                }
            }
        } finally {
            cerrojo.unlock();
        }
    }

    public void abrir() throws RemoteException {
        try {
            cerrojo.lock();
            cerrado = false;
            parar.signalAll();
        } finally {
            cerrojo.unlock();
        }
    }

    public void cerrar() throws RemoteException {
        try {
            cerrojo.lock();
            cerrado = true;
            parar.signalAll();
        } finally {
            cerrojo.unlock();
        }
    }
}
