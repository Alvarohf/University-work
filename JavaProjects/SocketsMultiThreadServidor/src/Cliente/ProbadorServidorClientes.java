/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Gasolinera.GasolineraInterfaz;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class ProbadorServidorClientes {

    public static void main(String[] args) {
        //Lanza 1 servidor gasolinera y 3 clientes
        GasolineraInterfaz gasolinera = new GasolineraInterfaz();
        gasolinera.setVisible(true);
        for (int i = 0; i < 2; i++) {
            InterfazCliente interfaz = new InterfazCliente();
            interfaz.setVisible(true);
        }
    }

}
