/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class ListaThread {

    //Declaracion de variables globales
    private ArrayList<Thread> lista = new ArrayList<>();
    private String[] vehiculoSurtidores = {"", "", "", "", "", "", "", ""};
    private String[] operariosSurtidores = {"", "", "", "", "", "", "", ""};
    private String colaEsperaTxt = "";

    //Constructor
    public ListaThread() {
    }

    /*Metodos para introducir y sacar vehiculos en cola de espera
    -------------------------------------------------------------*/
    /**
     * Recibe un hilo lo añade a la lista
     *
     * @param t (Thread) Hilo que representa a un vehiculo
     */
    public synchronized void meter(Thread t) {
        lista.add(t);
    }

    /**
     * Saca el hilo que se le pasa como argumento de la lista
     *
     * @param t
     */
    public synchronized void sacar(Thread t) {
        lista.remove(t);

    }
    
    /*Metodos para introducir y sacar vehiculos en los surtidores
    ----------------------------------------------------------------------*/
    /**
     * Añade un hilo a la lista y muestra los datos en varios JTextFields
     *
     * @param t (Thread) Hilo que se va a añadir a la lista
     */
    public void meterSurtidores(Thread t) {
        lista.add(t);
        //Inserta el texto en nuestro array de strings
        meterVehiculo(t.getName());
        //Muestra el array de strings
    }

    /**
     * Coge un vehiculo de la lista, lo elimina y lo devuelve
     *
     * @return (Thread) Devuelve el vehiculo eliminado
     */
    public synchronized Thread coger() {
        //Declaramos t
        Thread t;
        //Si cuando lo coge no esta vacia la lista de vehiculos (Threads)
        if (!lista.isEmpty()) {
            //Obtiene el primero que espera
            t = lista.get(0);
            //Lo elimina
            lista.remove(t);
            //Si estuviera vacia entonces devuelve null que se tratara ya en la otra clase    
        } else {
            t = null;
        }
        //Devuelve el t obtenido
        return t;
    }

    /**
     * Comprueba si la lista esta vacio devolviendo un booleano
     *
     * @return (boolean) Un boolean que es true si esta vacia
     */
    public boolean vacio() {
        return lista.isEmpty();
    }
    
    /*Metodos para actualizar los textos de cada elemento al ser modificados
    ------------------------------------------------------------------------*/
    
    /**
     * Actualiza el string que simula ser la cola
     */
    public synchronized void calcularColaEspera() {
        //Concatena en contenido los elementos que tiene la lista
        String contenido = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getName() != null) {
                contenido = contenido + lista.get(i).getName() + " | ";
            }

        }
        colaEsperaTxt = contenido;
    }


    /**
     * Introduce el texto en el array de strings
     *
     * @param vehiculo Nombre del vehiculo que se va a introducir en el array
     */
    public void meterVehiculo(String vehiculo) {
        //Declaramos e inicializamos i
        int i = 0;
        //Recorre todo el array o hasta que encuentra una coincidencia
        while (i < vehiculoSurtidores.length && i != -1) {
            //Si esta vacio reemplaza el valor con el nombre
            if (vehiculoSurtidores[i].equals("")) {
                vehiculoSurtidores[i] = vehiculo;
                //i debe de ser -2 porque despues se incrementa en 1
                i = -2;
            }
            //Incrementamos en 1 la i
            i++;
        }
    }

    /**
     * Reemplaza el texto por una cadena vacia en los arrays
     *
     * @param vehiculo (String) Nombre del vehiculo que se va a sacar
     */
    public void sacarVehiculo(String vehiculo) {
        //Declaramos e inicializamos i
        int i = 0;
        //Recorre todo el array o hasta que encuentra una coincidencia
        while (i < vehiculoSurtidores.length && i != -1) {
            //Si esta vacio reemplaza el valor con el nombre
            if (vehiculoSurtidores[i].equals(vehiculo)) {
                vehiculoSurtidores[i] = "";
                //i debe de ser -2 porque despues se incrementa en 1
                operariosSurtidores[i] = "";
                i = -2;
            }
            //Incrementamos en 1 la i
            i++;
        }
    }

    /**
     * Introduce los operarios en el array de strings
     *
     * @param vehiculo (String) Nombre del vehiculo que nos servira para situar
     * al operario
     * @param operario (Operario) Operario que saldra en la posicion adecuada
     */
    public synchronized void meterOperario(String vehiculo, Operario operario) {
        for (int i = 0; i < operariosSurtidores.length; i++) {
            //Si coincide el vehiculo con el de la lista entonces pondra al operario
            if (vehiculo.equals(vehiculoSurtidores[i])) {
                operariosSurtidores[i] = operario.getName();
            }
        }
    }
     /*Metodos para mostrar los datos en los JTextFields
    ------------------------------------------------------------------------*/
    /**
     * Muestra los vehiculos en los JTextFields
     *
     * @param vehiculosTxtFld
     */
    public synchronized void mostrarVehiculos(JTextField[] vehiculosTxtFld) {
        for (int i = 0; i < vehiculosTxtFld.length; i++) {
            vehiculosTxtFld[i].setText(vehiculoSurtidores[i]);

        }
    }

    /**
     * Muestra los vehiculos en los JTextFields
     *
     * @param operariosTxtFld
     */
    public synchronized void mostrarOperarios(JTextField[] operariosTxtFld) {
        for (int i = 0; i < operariosTxtFld.length; i++) {
            operariosTxtFld[i].setText(operariosSurtidores[i]);

        }
    }

    /**
     * Imprime en el unico JTextField con los vehiculos que esperan en la cola
     * de espera
     *
     * @param colaEsperaTxtFld
     */
    public synchronized void mostrarColaEspera(JTextField colaEsperaTxtFld) {
        //Muestra en el JTextField el contenido del string
        colaEsperaTxtFld.setText(colaEsperaTxt);
    }
    /**
     * Devuelve un array de String que contiene a los vehiculos
     *
     * @return (String[]) Array que contiene todos los vehiculos
     */
    
     /*Metodos para obtener los datos
    ------------------------------------------------------------------------*/
    
    public String[] getVehiculoSurtidores() {
        return vehiculoSurtidores;
    }
    /**
     * Devuelve un array de String que contiene a los operarios
     *
     * @return (String[]) Array que contiene todos los operarios
     */
    public String[] getOperariosSurtidores() {
        return operariosSurtidores;
    }
    /**
     * Devuelve un String que contiene a los vehiculos que esperan fuera
     *
     * @return (String) Array que contiene todos los vehiculos
     */
    public String getColaEsperaTxt() {
        return colaEsperaTxt;
    }
    
}
