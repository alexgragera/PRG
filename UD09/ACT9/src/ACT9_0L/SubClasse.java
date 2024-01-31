package ACT9_0L;

/**
 *
 * @author winadmin
 */
// Clase que extiende la clase abstracta e implementa la interfaz
class SubClasse extends ClasseAbstracta implements Interficie {
    
    // Implementaci� del m�tode de la classe abstracta
    @Override
    public void metodeAbstracteDeClasse() {
        System.out.println("Implementaci� del m�tode de la classe abstracta en 'SubClasse'");
    }

    // Implementaci� del m�tode de la Interf�cie
    @Override
    public void metodeAbstracteDeInterficie() {
        System.out.println("Implementaci� del m�tode de la Interf�cie en 'SubClasse'");
    }
}
