
package poker;
import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;

/**
 * Contiene al jugador registrado
 * @author Alvaro de las Heras
 */
public class JugadorRegistrado extends Jugador implements Serializable{
    private String cuenta;//Porque el numero de cuenta contiene caracteres(IBAN)
    private String contrasenna;
    private final LocalDate registro;
    //Lista de premios
    private ArrayList<Premio> premios;
    /**
    *Constructor
    * @param nif El nif del usuario (String)
    * @param nombre El nombre del usuario (String)
    * @param apellidos Los apellidos del usuario (String)
    * @param cuenta La cuenta del usuario (String)
    * @param nacimiento La fecha de nacimiento del usuario(String)
    * @param contrasenna La contraseña del jugador registrado (String)
    * @param fecha La fecha de registro del usuario (LocalDate)
    * @param saldo cantidad de dinero del usuario (int)
    */
    public JugadorRegistrado(String nif, String nombre, String apellidos, String cuenta, LocalDate nacimiento, String contrasenna,LocalDate fecha,int saldo) {
        super(nif, nombre, apellidos,nacimiento,saldo);
        this.cuenta=cuenta;
        this.registro=fecha;
        this.contrasenna=contrasenna;
        this.premios= new ArrayList<Premio>();
        
    }
    /**
    *Devuelve la Cuenta
    * @return Devuelve un String con el numero de cuenta
    */
    public String getCuenta() {
        return cuenta;
    }
    public String getContrasenna() {
        return contrasenna;
    }
    public LocalDate getFecha() {
        return registro;
    }
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public LocalDate getRegistro() {
        return registro;
    }
    public ArrayList<Premio> getPremios() {
        return premios;
    }
    /**
     * Retira los beneficios y asigna un bonus
     * @return devuelve el saldo mas el bonus (int)
     */
    @Override
    public int retirarBeneficios(){
        int beneficio;
        LocalDate hoy = LocalDate.now();
        Period p = Period.between(registro,hoy);
        double bonus= Math.pow(1.02,p.getYears());
        beneficio= (int) (bonus*super.getSaldo());
        super.setSaldo(0);
        return beneficio;
    }
    /**
     * Añade premios a la lista de premios
     * @param premio premio que se añade (Premio)
     */
      public void  anadirPremio(Premio premio){
        premios.add(premio);
    }
    @Override
    /**
    *Pasa a String todos los datos del jugador
    * @return Devuelve un String con los datos del jugador
    */
    public String toString() {
        return "El jugador registrado cuyo NIF es: "+super.toString() + " cuenta: " + cuenta+" registro: "+registro+" contrasenna: "+contrasenna;
    }
 }
    

