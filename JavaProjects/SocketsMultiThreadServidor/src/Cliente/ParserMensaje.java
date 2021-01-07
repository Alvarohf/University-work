/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class ParserMensaje {

    /**
     * Convierte un string (antiguo array) en un array de strings
     *
     * @param string (String) Antiguo array que ahora es un string
     * @return (String[])Devuelve el array que era el string
     */
    public static String[] stringToArray(String string) {
        //Eliminamos corchetes y hacemos un split por las comas
        String[] strings = string.replace("[", "").replace("]", "").split(",");
        return strings;
    }

    /**
     * @param string (String) Mensaje que ha enviado el servidor
     * @return (int) Entero que se corresponde con un tipo de los mensajes
     * recibidos
     */
    public static int detectarTipo(String string) {
        //Declaramos e iniciamos variables
        int tipo = -1;
        //Se corresponde con el primer caracter que identifica el tipo de mensaje
        String id = String.valueOf(string.charAt(0));
        //Segun sea el caracter es de un tipo u otro
        if ("@".equals(id)) {
            tipo = 1;
        } else if ("#".equals(id)) {
            tipo = 2;
        } else if ("%".equals(id)) {
            tipo = 0;
        }
        //Finalmente devolvemos el tipo
        return tipo;
    }

}
