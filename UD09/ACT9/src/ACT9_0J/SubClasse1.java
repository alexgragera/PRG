package ACT9_0J;

/**
 *
 * @author gt
 */
class SubClasse1 extends ClasseAbstracta {
    int b1;
    String b2;
    
    public SubClasse1(int a1, int b1, String b2) {
        super(a1);
        this.b1 = b1;
        this.b2 = b2;
    }

    // Implementaci� del M�todo abstracte de la Classe abstracta  
    @Override
    public void metodeConcret() {
        System.out.println("M�TODE CONCRET implementat en SubClasse1");
    }
    
    // Implementaci� del M�todo abstracte de la Classe abstracta  
    @Override
    public void metodeAbstracte() {
        System.out.println("M�TODE ABSTRACTE implementat en SubClasse1");
    }
}