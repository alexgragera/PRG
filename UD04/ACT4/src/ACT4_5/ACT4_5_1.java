package ACT4_5;

import ACT4_3.UtilitatsConsola;

/**
 * 
 * Crea un m�tode anomenat 'calculaPot�ncia'  dins la classe 'UtilitatsRecOrdCerca'.
 * Ha de rebre una base i un exponent i ha de calcular la potencia de la base elevat a l'exponent 
 * mitjan�ant una t�cnica recursiva.
 * 
 * @author T.Vives
 */
public class ACT4_5_1 {
    public static void main(String[] args) {
        int base = UtilitatsConsola.llegirSencer("Introdueixi la base: ");
        int exponent = UtilitatsConsola.llegirSencer("Introdueixi l'exponent: ");

        System.out.println(UtilitatsRecOrdCerca.calculaPotencia(base, exponent));
    }
}
