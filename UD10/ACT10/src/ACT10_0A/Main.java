package ACT10_0A;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        Empleat empleat = Empleat.getEmpleat("Immaculada", "Solsona");
        empleat = Empleat.getEmpleat("Esperanša", "Torres");  // Aquesta instÓncia no es generarÓ
        
        System.out.println(empleat.toString());
    }
    
}
