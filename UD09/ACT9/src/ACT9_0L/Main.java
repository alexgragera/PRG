package ACT9_0L;

/**
 *
 * @author winadmin
 */
public class Main {
    public static void main(String[] args) {
        SubClasse instancia = new SubClasse();
        
        instancia.metodeAbstracteDeClasse(); // Implementaci� del m�tode abstracte de classe en 'SubClasse'
        instancia.metodeAbstracteDeInterficie(); // Implementaci�n del m�tode abstracte de interf�cie en 'SubClasse'
        //
        SubClasse.metodeEstatic();
        Interficie.metodeEstatic();
        instancia.metodeConcret(); // Implementaci� concreta en la 'classe abstracta'
        instancia.metodePerDefecte();  // Implementaci� del m�tode per defecte en 'Interficie'
    }
}
