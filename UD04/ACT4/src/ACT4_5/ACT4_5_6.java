package ACT4_5;

import ACT4_1.UtilitatsArrays;


public class ACT4_5_6 {
    public static void main(String[] args) {
        int[] array = UtilitatsArrays.generaArray(3,1,100);

        UtilitatsArrays.mostraArray(array);
        if (UtilitatsRecOrdCerca.ordenaArray3(array)) {
            UtilitatsArrays.mostraArray(array);
        } else {
            System.out.println("L'array no es pot ordenar");
        }
    }
}