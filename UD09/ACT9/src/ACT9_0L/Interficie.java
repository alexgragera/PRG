package ACT9_0L;

/**
 *
 * @author winadmin
 */

// Interfaz
interface Interficie {
    void metodeAbstracteDeInterficie();
    
    default void metodePerDefecte() {
        metodePrivat();
        System.out.println("Implementaci� del m�tode per defecte en 'Interficie'");
    }
    
    private void metodePrivat() {
        System.out.println("Implementaci� d'un m�tode privat en 'Interficie'");
    }
}

