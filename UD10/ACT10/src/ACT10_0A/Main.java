package ACT10_0A;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        Empleat empleat = Empleat.getEmpleat("Immaculada", "Solsona");
        empleat = Empleat.getEmpleat("Esperan�a", "Torres");  // Aquesta inst�ncia no es generar�
        
        System.out.println(empleat.toString());
    }
    
}
