
import static java.lang.Thread.sleep;
import java.rmi.RemoteException;
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
public class Visitante extends Thread{

    Exposicion expo;
    Paso paso;

    public Visitante(int id, Exposicion expo, Paso paso) {
        super.setName(String.valueOf(id));
        this.expo = expo;
        this.paso = paso;
    }

    @Override
    public void run() {
            try {
                sleep((int) (3000 * Math.random()));
            } catch (InterruptedException e) {}
            
                try {
                    paso.mirar();
                } catch (RemoteException ex) {
                    Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
                }
                    expo.entrar(this); //Entra en la exposición, si hay hueco; y sino espera en la cola
                try {
                    paso.mirar();
                } catch (RemoteException ex) {
                    Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
                }
                    expo.mirar(this); //Está un tiempo dentro de la exposición
                try {
                    paso.mirar();
                } catch (RemoteException ex) {
                    Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
                }
                    expo.salir(this); //Sale de la exposición
                
            
    }
}
