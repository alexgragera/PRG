package ACT9_6B;

import ACT9_6A.*;
import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class Client {

    private String nom;
    private String cognom;
    private ArrayList<Producte> productes;

    public Client(String nom, String cognom, ArrayList<Producte> productes) {
        this.nom = nom;
        this.cognom = cognom;
        this.productes = productes;
    }

    // Mètode per calcular el descompte total
    public double calculaPreuTotal() {
        double preu = 0.0;
        for (Producte p : productes) {
            if (p instanceof Electronic) {
                preu += p.getPreu() - ((Electronic) p).calculaDescompte();
            } else if (p instanceof Electrodomestic) {
                preu += p.getPreu() + ((Electrodomestic) p).calculaSuplement();
            }
        }
        return preu;
    }

    @Override
    public String toString() {
        String text = "Client {" + "Nom: " + this.nom + ", Cognom: " + this.cognom + " {";
        for (Producte p : productes) {
            text += "\n\t" + p.toString();
        }
        text += "\n\t" + "Preu total: " + calculaPreuTotal();
        return text;
    }

}
