package PROVA1;

/**
 *
 * @author gt
 */
abstract class ClasseAbstracta {
    // M�todo concreto en la clase abstracta
    public void metodoConcreto() {
        System.out.println("Implementaci�n concreta en la clase abstracta");
    }

    // M�todo abstracto que debe ser implementado por las subclases
    public abstract void metodoAbstracto();
}