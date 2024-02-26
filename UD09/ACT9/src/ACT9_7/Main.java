package ACT9_7;

import java.util.ArrayList;

/**
 *
 * @author alexg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Llibre> llibres = new ArrayList<>();
        ArrayList<Llibre> llibresPrestat = new ArrayList<>();

        Biblioteca b = new Biblioteca(llibres);

        Llibre l;
        l = new Llibre("El quijote", "Cervantes", 1605, 35.0);
        llibres.add(l);

        l = new Llibre("Harry Potter", "Harry", 1890, 25.0);
        llibres.add(l);

        l = new Llibre("El ni?o del pijama de rayas", "Staling", 11780, 21.5);
        llibres.add(l);

        Cliente c = new Cliente("Alex", "Gragera", llibresPrestat);
        Llibre a = b.cercaLlibre("Harry Potter");
        llibresPrestat.add(a);
        
        System.out.println(c.toString());
    }

}
