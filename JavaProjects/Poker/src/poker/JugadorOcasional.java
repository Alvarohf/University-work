package poker;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Contiene al jugador ocasional
 * @author Usuario
 */
public class JugadorOcasional extends Jugador implements Serializable{
    private String tarjeta;
    /**
    *Constructor
    * @param nif El nif del usuario (String)
    * @param nombre El nombre del usuario (String)
    * @param apellidos Los apellidos del usuario (String)
    * @param tarjeta La tarjeta del usuario (String)
    * @param nacimiento La fecha de nacimiento del usuario (LocalDate)
    * @param saldo cantidad de dinero del usuario (int)
    */
    public JugadorOcasional( String nif, String nombre, String apellidos,String tarjeta,LocalDate nacimiento,int saldo) {
        super(nif, nombre, apellidos,nacimiento,saldo);
        this.tarjeta = tarjeta;
        
    }
    @Override
    public int retirarBeneficios(){
        int beneficio= super.getSaldo();
        super.setSaldo(0);
        return beneficio;
    }
     /**
    *Devuelve la tarjeta
    * @return Devuelve un String con el numero de tarjeta
    */
    public String getTarjeta() {
        return tarjeta;
    }
    @Override
    /**
    *Pasa a String todos los datos del jugador
    * @return Devuelve un String con los datos del jugador
    */
    public String toString() {
        return "El jugador ocasional cuyo NIF es: "+ super.toString()+ " tarjeta:" + tarjeta;
    }
}
