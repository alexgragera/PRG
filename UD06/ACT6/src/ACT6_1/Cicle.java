package ACT6_1;

/**
 *
 * @author T.Vives
 */
public class Cicle {
    public  int idCicle;
    public String nom;
    public int numAlumnes;

    // M�duls
    public String mostraCicle() {
        String text;
        
        text = "Cicle " + "ID=" + idCicle + ", nom=" + nom + ", numAlumnes=" + numAlumnes;
        
        return text;
    }
    
}
