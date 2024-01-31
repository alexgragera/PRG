package ACT9_0L;

/**
 *
 * @author winadmin
 */

// Clase abstracta
abstract class ClasseAbstracta {
    // M�tode abstracte que ha de ser implementat en la SubClasse
    public abstract void metodeAbstracteDeClasse();
    
    public static void metodeEstatic() {
        System.out.println("Implementaci� d'un m�tode est�tic1 en 'ClasseAbstracta'");
    }
    
    // M�tode concreo en la classe abstracta
    public void metodeConcret() {
        metodePrivat();
        System.out.println("Implementaci� del m�tode concret en 'ClasseAbstracta'");
    }

    private void metodePrivat() {
        System.out.println("Implementaci� d'un m�tode privat en m�tode concret de 'ClasseAbstracta'");
    }

}



