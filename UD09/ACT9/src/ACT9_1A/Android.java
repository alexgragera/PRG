package ACT9_1A;

/**
 *
 * @author winadmin
 */
public class Android extends Telefon implements ValidarDispositiu {
    private String patroCodiPin;
    private String patroTeclat;
    private String patroEmprempta;
 
    // Constructors
    public Android(String marca, Persona persona, String patroCodiPin, String patroTeclat, String patroEmprempta) {
        super(marca, persona, false);
        this.patroCodiPin = patroCodiPin;
        this.patroTeclat = patroTeclat;
        this.patroEmprempta = patroEmprempta; 
    }
    
    /** Constructor sense patrons, a continuaci� utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public Android(String marca, Persona persona) {
        super(marca, persona, false);
    }

    
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmprempta(patroEmprempta);
    }
    
    private void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }

    private void setPatroEmprempta(String patroEmprempta) {
        this.patroEmprempta = patroEmprempta;
    }
 
    private void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }
 
    @Override
    public boolean validaPatrons(Persona persona) {
        if (super.getOnOff()) {
            if (persona.getPatroCodiPin() != null) 
                return persona.getPatroCodiPin().equals(patroCodiPin);
            if (persona.getPatroTeclat() != null) 
                return persona.getPatroTeclat().equals(patroTeclat);
            if (persona.getPatroEmprempta() != null) 
                return persona.getPatroEmprempta().equals(patroEmprempta);
            return false;
        } else {
            System.out.println("Tel�fon Android no enc�s");
            return false;
        }
    }

}
