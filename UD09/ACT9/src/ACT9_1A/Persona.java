package ACT9_1A;

/**
 *
 * @author winadmin
 */
public class Persona implements ValidadorDispositius {
 
    private String nom;
    // Diferents sistemes de validaci�
    private String patroCodiPin;
    private String patroTeclat;
    private String patroEmprempta;
    private String patroRostre;
    
    Persona(String nom) {
        this.nom = nom;
    }
    
    Persona(String nom, String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setNom(nom);
        setPatrons(patroCodiPin,patroTeclat,patroEmprempta,patroRostre);
    }

    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmprempta(patroEmprempta);
        setPatroRostre(patroRostre);
    }

    @Override
    public boolean validaPatrons(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public String getPatroCodiPin() {
        return patroCodiPin;
    }
 
    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }
    
    public String getPatroTeclat() {
        return patroTeclat;
    }
 
    public void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }
    
    public String getPatroEmprempta() {
        return patroEmprempta;
    }
 
    public void setPatroEmprempta(String patroEmprempta) {
        this.patroEmprempta = patroEmprempta;
    }
 
    public String getPatroRostre() {
        return patroRostre;
    }
 
    public void setPatroRostre(String patroRostre) {
        this.patroRostre = patroRostre;
    }

}
