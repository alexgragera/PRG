package PROVA1;

/**
 *
 * @author gt
 */
public class Main {
    public static void main(String[] args) {
        SubClasse instancia = new SubClasse();
        
        instancia.metodoConcreto(); // Salida: Implementaci�n concreta en la clase abstracta
        instancia.metodoAbstracto(); // Salida: Implementaci�n del m�todo abstracto en la subclase
    }
}