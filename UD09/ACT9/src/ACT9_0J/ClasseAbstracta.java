package ACT9_0J;

/**
 *
 * @author gt
 */
abstract class ClasseAbstracta {
    int a1;
    
    public ClasseAbstracta(int a1) {
        this.a1 = a1;
    }
 
    // M�todo abstracte per ser implementat en SubClasse
    public abstract void metodeAbstracte();
    
    // M�tode concret en la classe abstracta
    public void metodeConcret() {
        System.out.println("M�TODE CONCRET en Classe abstracta");
    }
}