package prova;

/**
 *
 * @author winadmin
 */
public class prova2 {
    
}
interface MiInterfaz {
    default void metodoPorDefecto() {
        System.out.println("Implementaci�n por defecto en la interfaz");
    }
}

class MiClase implements MiInterfaz {
    // La clase hereda autom�ticamente el m�todo por defecto de la interfaz
}

class OtraClase implements MiInterfaz {
    // Se puede optar por sobrescribir el m�todo por defecto si se desea
    @Override
    public void metodoPorDefecto() {
        System.out.println("Implementaci�n personalizada en OtraClase");
    }
}

public class Main {
    public static void main(String[] args) {
        MiClase instancia1 = new MiClase();
        instancia1.metodoPorDefecto(); // Salida: Implementaci�n por defecto en la interfaz

        OtraClase instancia2 = new OtraClase();
        instancia2.metodoPorDefecto(); // Salida: Implementaci�n personalizada en OtraClase
    }
}
