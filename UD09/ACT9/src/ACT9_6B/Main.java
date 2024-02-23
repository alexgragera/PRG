package ACT9_6B;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Producte> productes = new ArrayList<>();

        Producte p;

        p = new Telefon(27, "intel i5", 32, 1024, "Omen", 1500, 150.0, 6);
        productes.add(p);

        p = new Portatil(27, "snapDragon", 16, 256, "pavilion", 1000, 70, 12);
        productes.add(p);

        p = new Televisor(70, "intel", 16, 128, "LG", 500, 65.5, 3);
        productes.add(p);

        p = new Gelera('A', "balay", 250, 80.0, 2);
        productes.add(p);

        p = new Rentadora(40, 'A', "balay", 250, 80.0, 2);
        productes.add(p);

        p = new Rentavaixelles('B', "Samsung", 150, 80.0, 2);
        productes.add(p);
        
        Client cliente = new Client("Alex","Gragera",productes);
        
        System.out.println(cliente.toString());
    }
}
