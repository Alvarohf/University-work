/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JTextField;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class Cliente extends Thread {

    //Declaracion de variables
    private JTextField colaEspera;
    private JTextField[] vehiculos, operarios;
    private Socket cliente;
    private DataInputStream entrada;
    private String respuesta;

    public Cliente(JTextField colaEspera, JTextField[] vehiculos, JTextField[] operarios) {
        this.colaEspera = colaEspera;
        this.operarios = operarios;
        this.vehiculos = vehiculos;

    }

    @Override
    public void run() {
        try {
            //Declaramos las variables locales
            int tipo;
            String mensaje;
            //Creamos el socket en este caso para actuar de forma local en el puerto 5000
            cliente = new Socket(InetAddress.getLocalHost(), 5000);
            //Creamos el canal de entrada de datos
            entrada = new DataInputStream(cliente.getInputStream());
            //Leemos el mensaje que envia el servidor
            respuesta = entrada.readUTF();
            //Hasta que el mensaje no sea salir no acaba la transmision

            while (!"salir".equals(respuesta)) {
                try {
                    //Volvemos a leer el canal de entrada
                    respuesta = entrada.readUTF();
                    //En caso de llegar al EOF simplemente salimos del bucle principal
                } catch (EOFException exception) {
                    break;

                }

                //Obtenemos el tipo de mensaje segun el identificador que posee
                tipo = ParserMensaje.detectarTipo(respuesta);
                //Segun el tipo que sea el mensaje se muestra en un sitio u otro
                switch (tipo) {
                    case 0:
                        //Si es 0 actualiza la cola de espera y quita el caracter
                        //identificador
                        colaEspera.setText(respuesta.substring(1));
                        break;
                    case 1:
                        //Si es 1 actualiza los operarios 
                        //Quita el caracter identificador
                        mensaje = respuesta.substring(1);
                        //Convertimos el string de respuesta en array de strings
                        String[] operarioArray = ParserMensaje.stringToArray(mensaje);
                        //Actualizamos cada textField
                        for (int i = 0; i < operarios.length; i++) {
                            operarios[i].setText(operarioArray[i]);

                        }
                        break;
                    case 2:
                        //Si es 2 actualiza los vehiculos
                        //Quita el caracter identificador
                        mensaje = respuesta.substring(1);
                        //Convertimos el string de respuesta en array de strings
                        String[] vehiculoArray = ParserMensaje.stringToArray(mensaje);
                        //Actualizamos cada textField
                        for (int i = 0; i < vehiculos.length; i++) {
                            vehiculos[i].setText(vehiculoArray[i]);

                        }
                        break;
                    default:
                        System.out.println("TODOS LOS DATOS RECIBIDOS");
                        break;
                }
            }
            //Si noi puede leer mas significa que el servidor ha dejado de transmitir
        } catch (java.net.ConnectException e) {
            System.out.println("NO SE HA PODIDO ESTABLECER CONEXION");
            System.exit(0);
        } catch (IOException e) {

            System.out.println("EL SERVIDOR DEJO DE TRANSMITIR");

            //Tras haber ejecutado todo entonces cerramos canales y socket, y salimos
        } finally {
            try {
                entrada.close();
                cliente.close();
                System.out.println("CIERRE DE CLIENTE");
                System.exit(0);
            } catch (IOException ex) {
                ex.printStackTrace(System.err);
            }
        }

    }
}
