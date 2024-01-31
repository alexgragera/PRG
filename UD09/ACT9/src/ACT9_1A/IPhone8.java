package ACT9_1A;

/**
 *
 * @author winadmin
 */

public class IPhone8 extends Telefon implements ValidarDispositiu {
    private String patroCodiPin;
    private String patroEmprempta;

    public IPhone8(String marca, Persona persona) {
        super(marca, persona, false);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroEmprempta(patroEmprempta);
    }
    
 
    protected void setPatroEmprempta(String patroEmprempta) {
        this.patroEmprempta = patroEmprempta;
    }
 
    protected void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }
 
    @Override
    public boolean validaPatrons(Persona persona) {
        if (super.getOnOff()) {
            if (persona.getPatroCodiPin()!= null)
                return persona.getPatroCodiPin().equals(patroCodiPin);
            if (persona.getPatroEmprempta()!= null)
                return persona.getPatroEmprempta().equals(patroEmprempta);
            return false;
        } else {
            System.out.println("Tel�fon IPhone8 no enc�s");
            return false;
        }
    }
     
}