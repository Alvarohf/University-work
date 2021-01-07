package poker;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
/**
 * Almacena en un HashMap todos los jugadores
 * @author Alvaro de las Heras
 */
public class CasaApuestas implements Serializable {
    
    private static HashMap<String,JugadorRegistrado> jugadores ;

    public CasaApuestas() {
        this.jugadores = new HashMap<>();
    }
    public HashMap<String, JugadorRegistrado> getJugadores() {
        return jugadores;
    }
    /**
    * Método que añade un jugador a la coleccion
    * @param jugador objeto que representa a un jugador (JugadorRegistrado)
    */
    public void altaJugador(JugadorRegistrado jugador){
        jugadores.put(jugador.getNif(),jugador);
    }
    
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (true) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream oStreamJugadores = new FileOutputStream("jugadores.dat");
                ObjectOutputStream ooStreamJugadores = new ObjectOutputStream(oStreamJugadores);
                //guardamos los jugadores que hay en el mapa
                ooStreamJugadores.writeObject(jugadores);
                oStreamJugadores.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
    public static void cargarDatos() {
        try {
            //Lectura de los jugadores que hay en el mapa
            FileInputStream iStreamJugadores = new FileInputStream("jugadores.dat");
            ObjectInputStream oiStreamJugadores = new ObjectInputStream(iStreamJugadores);
            jugadores = (HashMap < String, JugadorRegistrado>) oiStreamJugadores.readObject();
            iStreamJugadores.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
    /**
    * Método que elimina a un jugador del Hashmap
    * @param NIF objeto que representa el nif (String)
    */
    public void bajaJugador(String NIF){
         JugadorRegistrado baja =jugadores.get(NIF);
         if (baja.getSaldo()>=0){
            baja.retirarBeneficios();
            jugadores.remove(NIF);
         }
    }
}
