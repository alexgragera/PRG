package ACT4_5;

import ACT4_3.UtilitatsConsola;

public class ACT4_5_4 {
    public static void main(String[] args) {
        int a = UtilitatsConsola.llegirSencer("Introdueixi un n�mero sencer: ");
        int b = UtilitatsConsola.llegirSencer("Introdueixi un n�mero sencer: ");

        System.out.print(UtilitatsRecOrdCerca.calculaMCD(a,b) + " ");
    }
}
