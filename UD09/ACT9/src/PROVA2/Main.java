package PROVA2;

/**
 *
 * @author gt
 */
public class Main {
    public static void main(String[] args) {
        MiClase instancia1 = new MiClase();
        instancia1.metodoPorDefecto(); // Salida: Implementaci�n por defecto en la interfaz

        OtraClase instancia2 = new OtraClase();
        instancia2.metodoPorDefecto(); // Salida: Implementaci�n personalizada en OtraClase
    }
}