package poker;
/**
 * Barajea y da 5 cartas al jugador
 * @author Alvaro de las Heras
 */
import java.util.Arrays;
import java.util.Random;
public class Baraja {
    /**
    * Método que mezcla una baraja de 40 cartas.
    * @return Devuelve un array de 40 numeros aleatorios que simbolizan una carta
    */
    public int[] mezclaBaraja(){
        
        Random rand = new Random();
        int[] baraja = new int[40];
        boolean[] comprobar = new boolean[40];
        int i = 0;
        int carta;
        //Se genera una baraja aleatoria de 40 cartas
        while (i < 40) {
            carta = rand.nextInt(40);
            //Va comprobando en el array de bool si se encuentra ocupado para que sean valores unicos    
            if (!comprobar[carta]) { 
                comprobar[carta] = true;
                baraja[i] = carta;
                i++;
            }
        }
        return baraja;
    }     
    /**
    * Método que coge las 5 primeras cartas de la baraja
    * @return Devuelve un array de 5 numeros enteros entre el 1 y el 40 unicos
    */
    public int[] crearMano(){ 
        int[] mano= new int[5];
        int[]baraja= mezclaBaraja();
        for(int i=0;i<5;i++){
            mano[i]=baraja[i];
        }
        Arrays.sort(mano);
        return mano;
    }
    /**
    * Método que coge las 5 primeras cartas de la baraja
    * @return Devuelve 4 arrays de 5 numeros enteros entre el 1 y el 40 unicos
    */
    public int[][] crearManosMesa(){ 
        //Se inicializa el array de arrays
        int[][] manos = new int[4][5];
        //Se crea la baraja
        int[] baraja= mezclaBaraja();
        for (int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                //Se van llenando los arrays con enteros de la baraja
                manos[i][j]=baraja[5*i+j];
            }
        }    
        return manos;
    }
}
