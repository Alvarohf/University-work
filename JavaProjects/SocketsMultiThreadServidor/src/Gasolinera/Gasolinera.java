/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class Gasolinera {

    //Declaracion de variables
    private int totalCoches = 0;
    private ListaThread colaEspera, surtidores;
    private final Semaphore semaforo;
    private final Paso pasoSurtidores = new Paso();
    private final Paso pasoRepostaje = new Paso();
    private final Paso pasoEspera = new Paso();
    private long tiempoInicial = 0;

    private JTextField[] operariosTxtFld, vehiculosTxtFld;
    private JTextField colaEsperaTxtFld;
    private Servidor serv;

    /**
     * Constructor de la clase Gasolinera
     *
     * @param nSurtidores (int) numero total de surtidores
     * @param totalCoches (int) numero total de coches que usaran el sistema
     * @param operariosTxtFld (JTextField[]) TextFields de la interfaz grafica
     * que mostraran a los operarios
     * @param vehiculosTxtFld (JTextField[])TextFields de la interfaz grafica
     * que mostraran a los vehiculos en los surtidores
     * @param colaEsperaTxtFld (JTextField) Muestra la cola de coches que
     * esperan a la entrada
     * @param serv (Servidor) Objeto Servidor al que se accederán a sus métodos
     */
    public Gasolinera(int nSurtidores, int totalCoches, JTextField[] operariosTxtFld, JTextField[] vehiculosTxtFld, JTextField colaEsperaTxtFld, Servidor serv) {
        //Inicializamos el semaforo que limitara los surtidores
        semaforo = new Semaphore(nSurtidores, true);
        //Inicializamos las colecciones que empleara el sistema
        colaEspera = new ListaThread();
        surtidores = new ListaThread();
        this.colaEsperaTxtFld = colaEsperaTxtFld;
        this.vehiculosTxtFld = vehiculosTxtFld;
        this.operariosTxtFld = operariosTxtFld;
        this.serv = serv;
        //Total de coches a procesar
        this.totalCoches = totalCoches;
        //Tiempo inicial del sistema
        tiempoInicial = System.currentTimeMillis();
        //Guardamos en el log el inicio del sistema
        guardarLog("----------INICIO DEL SISTEMA----------\r\n");
    }

    /**/
    /**
     * Simula entrada de vehiculos a la cola de la gasolinera y surtidores
     *
     * @param v (Vehiculo) hilo que representa a un vehiculo
     */
    public void entrar(Vehiculo v) {

        //Generamos y almacenamos un tiempo aleatorio para cada coche
        int tiempo = 500 + (int) (5500 * Math.random());
        //Esperamos ese tiempo por cada vehiculo que llegue

        try {
            sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gasolinera.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasoEspera.mirar();
        //Registramos ese tiempo generado en el log
        guardarLog(" |TIEMPO ENTRADA: |" + tiempo + " " + v.getName());
        //Introducimos el vehiculo tras haber esperado
        colaEspera.meter(v);
        colaEspera.calcularColaEspera();
        colaEspera.mostrarColaEspera(colaEsperaTxtFld);
        enviarMensajeColaEspera();
        //Usamos un semaforo para bloquear la entrada a surtidores

        try {
            semaforo.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace(System.err);
        }
        //Paramos la entrada a los surtidores
        pasoSurtidores.mirar();
        //Sacamos un vehiculo de cola de espera
        colaEspera.sacar(v);
        colaEspera.calcularColaEspera();
        enviarMensajeColaEspera();
        colaEspera.mostrarColaEspera(colaEsperaTxtFld);
        //Metemos un vehiculo en los suridores
        surtidores.meterSurtidores(v);
        surtidores.mostrarVehiculos(vehiculosTxtFld);
        enviarMensajeVehiculos();
        //Guardamos en el log los surtidores y los vehiculos que conienen
        guardarLog("SURTIDORES (1-8):  " + Arrays.toString(surtidores.getVehiculoSurtidores()) + " ENTRADA ");
    }

    /**
     * Simula el repostaje de un vehiculo y su salida de la gasolinera
     *
     * @param o (Operario) Se trata del operario que realiza la accion de
     * repostar
     */
    public void repostar(Operario o) { //Metodo que simula el repostaje de los operarios a los vehiculos
        //Declaracion de la variable local tiempo
        int tiempo;

        //Comprobamos que no esten vacios los surtidores
        if (!surtidores.vacio()) {

            //Como no estan vacios mostramos el contenido
            surtidores.mostrarVehiculos(vehiculosTxtFld);
            //Para a los operarios que repostan
            pasoRepostaje.mirar();
            //Coge y elimina el hilo almacenandolo en una variable local
            Thread t = surtidores.coger();
            //Al haber varios puede que no haya podido cogerlo por lo que lo definimos como null
            //Por lo que hay que hacer distincion y saber que pasa en cada momento

            if (t != null) {
                try {
                    //Guardamos el operario que atendera al vehiculo en el log
                    guardarLog("--ATENDIDO" + t.getName() + " POR " + o.getName());
                    //Muestra a los operarios en la interfaz grafica
                    surtidores.meterOperario(t.getName(), o);
                    enviarMensajeOperarios();
                    surtidores.mostrarOperarios(operariosTxtFld);
                    //Calculamos y guardamos en una variable los tiempos aleatorios
                    tiempo = (int) (3900 + Math.random() * 4000);
                    //Guardamos el log el tiempo obtenido para el operario
                    guardarLog(" |TIEMPO REPOSTAR: |" + tiempo + " " + o.getName());
                    //Esperamos el tiempo que hemos obtenido
                    Thread.sleep(tiempo);
                    //Capturamos posibles interrupciones al hacer el sleep
                } catch (InterruptedException ex) {
                    Logger.getLogger(Gasolinera.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Acabamos con un vehiculo por tanto dejamos que el semaforo meta uno mas
                semaforo.release();
                //Quitamos el vehiculo que teniamos almacenado de la interfaz grafica
                surtidores.sacarVehiculo(t.getName());

                surtidores.mostrarVehiculos(vehiculosTxtFld);
                enviarMensajeOperarios();
                surtidores.mostrarOperarios(operariosTxtFld);
                enviarMensajeVehiculos();
                //Guardamos en el log que vehiculo abandona
                guardarLog("ABANDONA " + t.getName());
                //Guardamos el log de los surtidores actualizados tras quitar el vehiculo
                guardarLog("SURTIDORES (1-8):  " + Arrays.toString(surtidores.getVehiculoSurtidores()) + " SALIDA ");
                //Se reduce en uno el total de vehiculos que entran al sistema
                totalCoches--;
            } else {
                //En caso de que sea null significa que no habia coches cuando ha accedido al metodo
                guardarLog(" NO TENGO COCHE EN ESTE INSTANTE - " + o.getName());
            }
            //Una vez llega a 0 el total de vehiculos que entran los operarios se van y se cierra el sistema
        } else if (totalCoches == 0) {
            {
                serv.setSalir(true);
                //Guardamos en el log la salida de los operarios
                guardarLog("------" + o.getName() + " VUELVE A CASA TRAS TRABAJAR DURAMENTE------");
                //Salimos del sistema
                System.exit(0);

            }
        }
    }

    /**
     * Devuelve el objeto paso usado para parar y reanudar el sistema de
     * repostar
     *
     * @return (Paso) Objeto de clase paso que actua como bloqueo
     */
    public Paso getPasoRepostaje() {
        return pasoRepostaje;
    }

    /**
     * Devuelve el objeto paso usado para parar y reanudar el sistema de
     * vehiculos
     *
     * @return Objeto de clase paso que actua como bloqueo
     */
    public Paso getPasoSurtidores() {
        return pasoSurtidores;
    }

    /**
     * Devuelve el objeto paso usado para parar y reanudar el sistema de
     * vehiculos
     *
     * @return Objeto de clase paso que actua como bloqueo
     */
    public Paso getPasoEspera() {
        return pasoEspera;
    }

    /**
     * Guarda el string que se le pasa en nuestro log del sistema
     *
     * @param log (String) Texto que guardara en el log
     */
    public void guardarLog(String log) {
        try {
            //Creamos un file writer que escriba o sobreescriba en el archivo
            FileWriter writer = new FileWriter("evolucionGasolinera.txt", true);
            //Escribimos el mensaje
            writer.write("\r\n");
            writer.write(" tiempo: " + (System.currentTimeMillis() - tiempoInicial) + log);
            writer.write("\r\n");   // write new line
            //Cerramos el writer
            writer.close();
            //Capturamos las posibles excepciones en el funcionamiento
        } catch (IOException e) {
            //Enviamos a la salida de errores el error que podamos haber tenido
            e.printStackTrace(System.err);
        }
    }

    /**
     * Envia el mensaje con los vehiculos
     */
    public synchronized void enviarMensajeVehiculos() {
        //Pasa el array a string y lo pasa al servidor junto a su identificador
        String mensaje = "#" + Arrays.toString(surtidores.getVehiculoSurtidores());
        serv.setMensaje(mensaje);
    }

    /**
     * Envia el mensaje con la cola de espera
     */
    public synchronized void enviarMensajeColaEspera() {
        //Pasa al servidor el mensaje junto a su identificador
        String mensaje = "%" + colaEspera.getColaEsperaTxt();
        serv.setMensaje(mensaje);
    }

    /**
     * Envia el mensaje con los operarios
     */
    public synchronized void enviarMensajeOperarios() {
        //Pasa el array a string y lo pasa al servidor junto a su identificador
        String mensaje = "@" + Arrays.toString(surtidores.getOperariosSurtidores());
        serv.setMensaje(mensaje);
    }
}
