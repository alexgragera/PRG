package ACT9_0L;

/**
 *
 * @author winadmin
 */

// Interfaz
interface Interficie {
    void metodeDeInterficie();
    
    default void metodePerDefecte() {
        System.out.println("Implementaci� del m�tode per defecte en 'Interficie'");
    }
}

