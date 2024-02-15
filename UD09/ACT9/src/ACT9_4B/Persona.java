package ACT9_4B;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class Persona {
    private String nom;
    private int edat;
    ArrayList<ProducteBancari> productesBancaris;
    
    public Persona(String nom, int edat, ArrayList<ProducteBancari> productesBancaris) {
        setNom(nom);
        setEdat(edat);
        setProductesBancaris(productesBancaris);
    }
    
    double calculaRemuneracioTotal() {
        double remuneracio = 0;
        for (ProducteBancari p : productesBancaris) {
            remuneracio += p.calculaRemuneracio();
        }
        
        return remuneracio;
    }

    @Override
    public String toString() {
        String text;
        text = "Persona nom=" + nom + ", edat=" + edat;
        for (ProducteBancari p : productesBancaris)
            text += "\n\t" + p.toString() + " Remuneració: " + p.calculaRemuneracio();
        
        return text;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setProductesBancaris(ArrayList<ProducteBancari> productesBancaris) {
        this.productesBancaris = productesBancaris;
    }

}
