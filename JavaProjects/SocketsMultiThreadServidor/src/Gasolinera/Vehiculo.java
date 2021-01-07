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
public class Vehiculo extends Thread {
    //Declaramos gasolinera
    private Gasolinera gasolinera;
    
    public Vehiculo(String nombre, int numero,Gasolinera gasolinera){
        //Cambiamos el nombre del thread al que le pasamos
        super.setName(String.valueOf(nombre+numero));
        //Inicializamos gasolinera
        this.gasolinera = gasolinera;
    }

    @Override
    public void run(){ 
        //Codigo que ejecuta el hilo
        
        gasolinera.entrar(this);
    }
}
