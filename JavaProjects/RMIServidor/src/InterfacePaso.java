
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvar
 */
public interface InterfacePaso extends Remote {
    void pausar() throws RemoteException;
    void renaudar() throws RemoteException;
    void mirar() throws RemoteException;
    void login() throws RemoteException;
    int getClientes() throws RemoteException;
    void logout() throws RemoteException;
}
