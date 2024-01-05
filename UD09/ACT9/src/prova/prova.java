package prova;

/**
 *
 * @author winadmin
 */
public class prova {
    
}

abstract class ClaseAbstracta {
    // M�todo concreto en la clase abstracta
    public void metodoConcreto() {
        System.out.println("Implementaci�n concreta en la clase abstracta");
    }

    // M�todo abstracto que debe ser implementado por las subclases
    public abstract void metodoAbstracto();
}

class Subclase extends ClaseAbstracta {
    // No es necesario sobre-escribir el m�todo concreto de la clase abstracta

    // Se implementa el m�todo abstracto de la clase abstracta
    @Override
    public void metodoAbstracto() {
        System.out.println("Implementaci�n del m�todo abstracto en la subclase");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclase instancia = new Subclase();
        instancia.metodoConcreto(); // Salida: Implementaci�n concreta en la clase abstracta
        instancia.metodoAbstracto(); // Salida: Implementaci�n del m�todo abstracto en la subclase
    }
}
