package ACT4_5;

import ACT4_1.UtilitatsArrays;
import ACT4_3.UtilitatsConsola;


public class ACT4_5_9 {
    public static void main(String[] args) {
        int[] array = UtilitatsRecOrdCerca.ordenaArrayBimbolla(UtilitatsArrays.generaArray(10,1,100));
        int num, posicio;
        
        UtilitatsArrays.mostraArray(array);
        num = UtilitatsConsola.llegirSencer("Introdueixi un n�mnero a cercar: ");
        posicio = UtilitatsRecOrdCerca.cercaArrayRecursiu( array, num, 0, array.length - 1 );
        
        if (posicio != -1 ) {
            System.out.println("S'ha trobat el n�mero en la posici� " + posicio);
        } else {
            System.out.println("No s'ha trobat el n�mero " + num);    
        }
    }
}