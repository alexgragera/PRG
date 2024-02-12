package ACT9_2B;

/**
 *
 * @author winadmin
 */
public abstract class Telefon extends ValidadorDispositius implements DispositiuElectronic {
    private String marca;  // Marca del Tel�fon
    private Persona persona;  // Dades de la persona propiet�ria
    private boolean onOff;  // Enc�s o apagat
        
    public Telefon(String marca, Persona persona, boolean onOff, String[] patrons) {
        super(patrons);
        this.marca = marca;
        this.persona = persona;
        this.onOff = onOff;
    }
    
    public boolean validaPatrons(Object o) {
        Persona persona = (Persona) o;
        
        if (getOnOff()) {
            if (persona.getPatroCodiPin() != null) 
                return persona.getPatroCodiPin().equals(this.getPatroCodiPin());
            if (persona.getPatroTeclat() != null) 
                return persona.getPatroTeclat().equals(this.getPatroTeclat());
            if (persona.getPatroEmprempta() != null) 
                return persona.getPatroEmprempta().equals(this.getPatroEmprempta());
            if (persona.getPatroRostre() != null) 
                return persona.getPatroRostre().equals(this.getPatroRostre());
            return false;
        } else {
            System.out.println("Tel�fon no enc�s");
            return false;
        }
    }
    
    public boolean getOnOff() {
        return this.onOff;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
    
    @Override
    public void on() {
        System.out.println("Tel�fon enc�s");
        if (!this.onOff)
            this.onOff = true;
    }
    
    @Override
    public void off() {
        System.out.println("Tel�fon apagat");
        if (this.onOff)
            this.onOff = false;
    }
    
    @Override
    public String toString() {
        return this.marca;
    }

}
