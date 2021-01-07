package poker;
/**
 * Contiene la clase que asigna el palo y figura
 * @author Alvaro de las Heras
 */
public class Carta {
    private int palo;
    private int figura;
    //Nunca se van a modificar
    private static final String[] PALOS={"oros","copas","espadas","bastos"};
    private static final String[] FIGURAS={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
    /**
     * Recibira un numero del cual obtendra un String tipo carta
     * @param carta Numero de la carta de la que se obtiene el palo y figura
     */
    public Carta(int carta) {
        this.palo = (carta/10);
        this.figura = (carta%10);
    }

    @Override
    /**
     *Convierte en String la carta
     * return Devuelve el nombre de la carta
     */
    public String toString() {
        return FIGURAS[figura]+" de "+ PALOS[palo]; //To change body of generated methods, choose Tools | Templates.
    }

   
}
