package ACT9_6A;

/**
 *
 * @author alexg
 */
public class Persona {

    private String nom;
    private String cognom;
    private Telefon telefon;
    private Portatil portatil;
    private Televisor televisor;

    public Persona(String nom, String cognom, Telefon telefon, Portatil portatil, Televisor televisor) {
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
        this.portatil = portatil;
        this.televisor = televisor;
    }
    
    public double calculaProducte(){
        return telefon.getPreu();
    }
    
    @Override
    public String toString() {
        return this.nom + this.cognom + this.telefon + this.portatil + this.televisor;
    }
    
    
}
