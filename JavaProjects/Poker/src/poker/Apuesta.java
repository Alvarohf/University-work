/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;
import java.util.*;
/**
 *Comprueba si la mano generada tiene premio
 * @author Alvaro
 */
public class Apuesta {
    /**
    * Metodo que comprueba si ha ganado y devuelve el premio correspondiente
    * @param esRegistrado Si el jugador esta registrado (booleano)
    * @param apuesta cantidad de la apuesta (entero)
    * @param cartas mano que se va a comprobar (array de enteros)
    * @param tipo el tipo puede ser mesa o individual(String)
    * @return El premio que ha obtenido (entero)
    */
        public Premio verPremio(boolean esRegistrado,int apuesta,int[]cartas, String tipo){
            //Es necesario el numero de las figuras para ver su premio
            int[]figuras=new int[5];
            //Multiplicadores según las cartas que se tengan
            int[] multiplicador ={0,1,2,3,4,5,6};
            int[] multiplicador2 ={0,1,2,4,6,8,10};
            int[] valores ={10,1,2,3,4,5,6,7,8,9};
            int valor=0;
            String[] premios={"Nada","Pareja","Doble pareja","Trio","Color","Full","Poker"};
            int premio=0;
            int cont=0;
            int cont2=0;
            //Bucle para poder obtener la figura
            for (int j =0; j<5;j++){
                figuras[j]=cartas[j]%10;
            }
            //Se ordenan los distintos int[] arrays
            
            Arrays.sort(figuras);
            //Comprueba si son iguales palos y figuras y los cuenta
            for (int j =1; j<5;j++){
                if ((figuras[j])==(figuras[j-1])) {
                    //Obtiene los distintos valores para comparar en caso de empate
                    valor+=2*valores[figuras[j]];
                    cont+=1;
                }              
                if ((cartas[j]/10)==(cartas[j-1]/10)){ 
                    cont2+=1;
                }
                }
            
            //Si llegan los contadores a estos numeros se asignan los premios
            //Pareja
            if (cont==1){
                premio=1;
            }
            //Trio
            if (cont==2){
                if ((figuras[2]==figuras[4])||(figuras[2]==figuras[0])) {  
                premio=3;
                }else premio=2;
            }
            //Poker o full
            if (cont==3) {  
                if (figuras[1]==figuras[3]) premio=6;
                else premio=5;
            }
            if (cont==0){
                //Obtiene el valor de las cartas si no hay nada para comparar en caso de empate
                valor=valores[figuras[0]]+valores[figuras[1]]+valores[figuras[2]]+valores[figuras[3]]+valores[figuras[4]];
            }
            //Color
            if (cont2==4) {
                premio=4;
                //Obtiene el valor del color para comparar en caso de empate
                valor=valores[figuras[0]]+valores[figuras[1]]+valores[figuras[2]]+valores[figuras[3]]+valores[figuras[4]];
            }
            //Se aplica el bonus de jugador registrado
            if (esRegistrado){ apuesta*=multiplicador2[premio];
            } else apuesta*=multiplicador[premio];
            //Se crea el objeto tipo premio
            Premio premiof = new Premio(apuesta,premios[premio],tipo,valor);
            return premiof;
        }
        /**
         * 
         * @param apuesta Es la cantidad que se va a apostar (int)
         * @param cartas Son todas las manos de la mesa (int[][])
         * @param tipo Es el tipo de premio que se va a obtener (String)
         * @return Devuelve el objeto de tipo premio (Premio)
         */
         public Premio verPremioMesa(int apuesta,int[][]cartas, String tipo){
            //Se van a comparar las cantidades de premios obtenidas por lo que se comienza de -1
            int cantidad=-1;
            int jugador=0;
            for (int i =0;i<4;i++){
                //Se obtiene el premio de cada mano de cartas
                Premio premio =verPremio(true,5,cartas[i],"Mesa");
                //Si es mayor que la cantidad anterior se guarda junto a su numero
                if (premio.getCantidad()>cantidad){
                   cantidad=premio.getCantidad();
                   jugador=i;
                    
                }
                //Si es igual la cantidad entonces se acuden a los valores para desempatar
                else if (premio.getCantidad()==cantidad){
                    if (premio.getValor()>verPremio(true,5,cartas[jugador],"Mesa").getValor()){
                        jugador=i;
                    }
                }
            }
                //Devuelve el premio del jugador registrado
                Premio premio =verPremio(true,0,cartas[3],"Mesa");
                if (jugador==3){
                    premio.setCantidad(apuesta*3);
                }
                return premio;
         
         }
}
