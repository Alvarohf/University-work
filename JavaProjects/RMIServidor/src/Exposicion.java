
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alvar
 */
public class Exposicion  {

    int aforo;
    ListaThread colaEspera, dentro;
    Semaphore semaforo;

    public Exposicion(int aforo, JTextField tfEsperan, JTextField tfDentro)  {
        this.aforo = aforo;
        semaforo = new Semaphore(aforo, true);
        colaEspera = new ListaThread(tfEsperan);
        dentro = new ListaThread(tfDentro);
    }

    public void entrar(Visitante v)  {
        colaEspera.meter(v);
        try {
            semaforo.acquire();
        } catch (InterruptedException e)  {
        }
        colaEspera.sacar(v);
        dentro.meter(v);
    }

    public void salir(Visitante v)  {
        dentro.sacar(v);
        semaforo.release();
    }

    public void mirar(Visitante v)  {
        try {
            Thread.sleep(2000 + (int) (3000 * Math.random()));
        } catch (InterruptedException e) {
        }
    }
}
