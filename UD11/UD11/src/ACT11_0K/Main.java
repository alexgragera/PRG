package ACT11_0K;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        Dia[] dies = Dia.values();  // Transformaci� 1
        List<Dia> llistaDies = Arrays.asList(dies);  // Transformaci� 2
        Iterator<Dia> iterator = llistaDies.iterator();
        while (iterator.hasNext()) {
            Dia dia = iterator.next();
            System.out.println(dia);
            //iterator.remove();
        }
    }

}
