/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Alvarohf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el buffer
        Buffer buf = new Buffer();
        //Creamos 5 productores
        Productor p= new Productor(buf,100,'A');
        Productor p1= new Productor(buf,100,'B');
        Productor p2= new Productor(buf,100,'C');
        Productor p3= new Productor(buf,100,'D');
        Productor p4= new Productor(buf,100,'E');
        //Creamos 3 consumidores
        Consumidor c= new Consumidor(buf,"Maria");
        Consumidor c1= new Consumidor(buf,"Juan");
        Consumidor c2= new Consumidor(buf,"Luis"); 
        //Iniciamos todos
        p.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        c.start();
        c1.start();
        c2.start();
    }
}
