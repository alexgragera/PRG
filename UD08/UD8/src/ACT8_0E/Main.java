/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ACT8_0E;

/**
 *
 * @author winadmin
 */
// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Circulo
        Cercle cercle = new Cercle("Vermell",5.0);

        // Llamar a m�todos de la clase abstracta y clase derivada
        System.out.println(cercle.toString());  // M�todo de la clase abstracta
        //miCirculo.mostrarRadio();  // M�todo de la clase derivada
        System.out.println("�rea del c�rculo: " + cercle.calculaArea()); // M�todo abstracto implementado en la clase derivada
    }
}
