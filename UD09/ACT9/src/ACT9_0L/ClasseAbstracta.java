package ACT9_0L;

/**
 *
 * @author winadmin
 */

// Clase abstracta
abstract class ClasseAbstracta {
    // M�tode abstracte que ha de ser implementat en la SubClasse
    public abstract void metodeAbstracte();
    
    // M�tode concreo en la classe abstracta
    public void metodoConcret() {
        System.out.println("Implementaci� del m�tode concret en 'ClasseAbstracta'");
    }


}



