package PROVA1;

/**
 *
 * @author gt
 */
class SubClasse extends ClasseAbstracta {
    // No es necesario sobre-escribir el m�todo concreto de la clase abstracta

    // Se implementa el m�todo abstracto de la clase abstracta
    @Override
    public void metodoAbstracto() {
        System.out.println("Implementaci�n del m�todo abstracto en la subclase");
    }
}
