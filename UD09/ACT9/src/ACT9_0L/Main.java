package ACT9_0L;

/**
 *
 * @author winadmin
 */
public class Main {
    public static void main(String[] args) {
        SubClasse instancia = new SubClasse();
        
        instancia.metodoConcret(); // Implementaci� concreta en la 'classe abstracta'
        instancia.metodeAbstracte(); // Implementaci�n del m�todo abstracto en 'SubClasse'
        instancia.metodeDeInterficie(); // Implementaci�n del m�todo de interfaz en 'SubClasse'
        instancia.metodePerDefecte();  // Implementaci� del m�tode per defecte en 'Interficie'
    }
}
