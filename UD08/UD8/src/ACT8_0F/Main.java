package ACT8_0F;

/**
 *
 * @author winadmin
 */

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Television
        int[] initialConfiguration = {50, 70, 80}; // Brillo, Color, Contraste
        Television televisio = new Television("Sony", false, "Model Trinitron", 42, 1, false, initialConfiguration);

        // Mostrar informaci�n inicial
        System.out.println("Initial TV Info:");
        System.out.println(televisio);

        // Encender el televisor
        televisio.turnOn();

        // Cambiar de canal
        televisio.changeChannel(5);

        // Mostrar informaci�n despu�s de cambiar de canal
        System.out.println("\nTV Info After Changing Channel:");
        System.out.println(televisio.toString());

        // Inicializar la pantalla con una nueva configuraci�n
        int[] newConfiguration = {60, 80, 90}; // Nueva configuraci�n de brillo, color, contraste
        televisio.initializeScreen(newConfiguration);

        // Mostrar informaci�n despu�s de inicializar la pantalla
        System.out.println("\nTV Info After Initializing Screen:");
        System.out.println(televisio);

        // Apagar el televisor
        televisio.turnOff();

        // Mostrar informaci�n despu�s de apagar
        System.out.println("\nTV Info After Turning Off:");
        System.out.println(televisio);
    }
}