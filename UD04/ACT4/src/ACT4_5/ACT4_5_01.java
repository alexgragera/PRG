package ACT4_5;
import java.util.ArrayList;
/**
 *
 * @author T.Vives
 */
public class ACT4_5_01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        for (String a: args) {
            array.add(a);			
        }

        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.print("]");
    }
}