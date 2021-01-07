/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;
/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class Operario extends Thread {
    //Declaramos gasolinera
    private final Gasolinera gasolinera;
    
    public Operario(String nombre, int numero, Gasolinera gasolinera) {
        //Cambiamos el nombre del thread al que le pasamos
        super.setName(String.valueOf(nombre + numero));
        //Inicializamos gasolinera
        this.gasolinera = gasolinera;
    }

    @Override
    public void run() {
        while (true) {
            //Codigo que ejecuta el hilo en un bucle infinito
            gasolinera.repostar(this);
        }
    }
}
