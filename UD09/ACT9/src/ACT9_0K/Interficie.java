package ACT9_0K;

/**
 *
 * @author gt
 */
interface Interficie {
    int a1 = 0;
    
    default void metodePerDefecte() {
        System.out.println("M�TODE PER DEFECTE en la interf�cie.");
    }
    
    public void metodeAbstracte();
}
