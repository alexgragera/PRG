package ACT9_5A2;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Persona {
    private String nom;
    private int edad;
    private ArrayList<ProducteBancari> producteBancari;
    
    public Persona(String nom, int edad,ArrayList<ProducteBancari> producteBancari){
        this.nom = nom;
        this.edad = edad;
        this.producteBancari = producteBancari;
    }
    
    public double calculaRemuneracioTotal(){
        return 0;
    }
    
    @Override
    public String toString() {
        String text;
        text = "Persona nom=" + nom + ", edat=" + edad;
        for (ProducteBancari p : producteBancari)
            text += "\n\t" + p.toString() + " Remuneració: " + p.calculaRemuneracio();
        
        return text;
    }
}
