package UD11_0A;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        Set<String> conjunt = new HashSet<>();
        conjunt.add("Element1");
        conjunt.add("Element2");
        conjunt.add("Element1");  // No es permeten duplicats
        for (String c : conjunt)
            System.out.println(c);
    }
    
}
