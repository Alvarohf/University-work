package poker;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Contiene a jugador
 * @author Alvaro de las Heras
 */
public abstract class Jugador implements Serializable{
    private final String nif;
    private final String nombre;
    private final String apellidos;
    private final LocalDate nacimiento;
    private int saldo;  
    /**
    *Constructor
    * @param nif El nif del usuario (String)
    * @param nombre El nombre del usuario (String)
    * @param apellidos Los apellidos del usuario (String)
    * @param nacimiento La fecha de nacimiento del usuario (String)
    * @param saldo cantidad de dinero del usuario (int)
    */
    public Jugador(String nif, String nombre, String apellidos, LocalDate nacimiento,int saldo) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.saldo = saldo;//El saldo inicial siempre va a ser de 0
    }
    public String getNif(){
        return nif;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
     public int getSaldo(){
        return saldo;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    } 
    /**
    *Modifica el saldo del usuario
    * @param cantidad Cantidad que gana o pierde con su apuesta(entero)
    */
    public void setSaldo(int cantidad) {
        this.saldo = (saldo+cantidad);
    }
    public void aumentarSaldo(int cantidad) {
        if (cantidad>0){
        this.saldo = (saldo+cantidad);
        }
    }
    abstract public int retirarBeneficios();
    @Override
    public String toString(){
        return (nif+" nombre: "+nombre+" apellidos: "+apellidos+" saldo: "+saldo+" nacimiento: "+nacimiento);
    }
}
