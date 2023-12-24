package ACT8_0C;

/**
 *
 * @author T.Vives
 * 
 * Exemple de Her�ncia Jer�rquica
 *     Vehicle
 *     ^    ^
 *     |    |
 * Cotxe    Moto
 * 
 */
// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases derivadas
        Cotxe cotxe = new Cotxe();
        Moto moto = new Moto();

        // Llamar a m�todos de la clase base y clases derivadas
        cotxe.arranca();  // M�tode de la clase base
        cotxe.condueix();  // M�tode de la clase derivada 1
        cotxe.frena();  // M�tode de la clase base

        System.out.println();

        moto.arranca();  // M�tode de la clase base
        moto.acelera();  // M�tode de la clase derivada 2
        moto.frena();  // M�tode de la clase base
    }
}

