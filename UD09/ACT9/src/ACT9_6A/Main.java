package ACT9_6A;

/**
 *
 * @author alexg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Telefon t = new Telefon("Iphone13",50.99,20,6,40);
        Portatil p = new Portatil("Pavilion",1000.99,55,6,80);
        Televisor tv = new Televisor("LG",50.99,20,6,40);
        
        Persona persona = new Persona("Pedro","Gordo",t,p,tv);
        
        double descuento = t.calculaDescompte() + p.calculaDescompte() + tv.calculaDescompte();
        System.out.println(persona.toString());
        System.out.println("descuento total: " + Math.round(descuento));
    }
    
}
