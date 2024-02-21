package ACT9_5A2;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ProducteBancari> productesBancaris = new ArrayList<>();
        
        CompteEstalvis c = new CompteEstalvis("000-010","Pep",50,0.5,20.5,new ArrayList<Tarjeta>());
        productesBancaris.add(c);
        
        Deposit d = new Deposit("000-150","pere",60,0.5,10);
        productesBancaris.add(d);
        
        Hipoteca h = new Hipoteca("000-650","pau",20,3,0.65,6);
        productesBancaris.add(h);
        
        Persona p = new Persona("alex",24,productesBancaris);
        
        System.out.println(p.toString());
    }
    
}
