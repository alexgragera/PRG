package ACT5_1;

/**
 *
 * @author T.Vives
 */
public class ACT5_1_1 {
    
    public static void main(String[] args) {
        int a=UtilitatsConsola.llegirSencer("Introdueixi el divident: ");
        int b=UtilitatsConsola.llegirSencer("Introdueixi el divisor: ");
        
        try {
            int c = a / b;
            System.out.println("La divisi� �s: " + c);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("No �s possible realitzar la divisi� per 0");
        }
    }
}
