
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvar
 */
public class Servidor extends UnicastRemoteObject implements InterfacePaso{
    private Paso p;
    private static int numClientes;

    public Servidor(Paso p) throws RemoteException {
        this.p = p;
        this.numClientes = 0;
    }
    public void pausar() throws RemoteException{
        p.cerrar();
    }
    public void renaudar() throws RemoteException{
        p.abrir();
    }
    public int getClientes() throws RemoteException{
        return numClientes;
    }
    public synchronized void login() throws RemoteException{
        if (numClientes < 10) {
            numClientes++;
            System.out.println("Total clientes conectados: " + getClientes());
        } else{
            while(numClientes >= 10){
                try {
                    System.out.println("No se pueden realizar mas conexiones, 10 clientes máximo");
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public synchronized void logout() throws RemoteException {
        numClientes--;
        System.out.println("Sesion cerrada, clientes conectados " + getClientes());
        notifyAll();
    }
    @Override
    public void mirar() throws RemoteException{
        throw new UnsupportedOperationException("Not suported yet.");
    }
}
