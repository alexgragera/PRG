package ACT9_1;

/**
 *
 * @author winadmin
 */
public abstract class Telefono implements DispositiuElectronic{
    private String marca;  // Marca del Tel�fon
    private Persona persona;  // Dades de la persona propiet�ria
    private boolean onOff;  // Enc�s o apagat
    
    public Telefono(String marca, Persona persona) {
        //super(); // No cal
        this.marca = marca;
        this.persona = persona;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public boolean getOnOff() {
        return onOff;
    }
    
    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
    
    @Override
    public void on() {
        System.out.println("Tel�fon enc�s");
        if (onOff)
            onOff = false;
    }
    
    @Override
    public void off() {
        System.out.println("Tel�fon apagat");
        if (onOff)
            onOff = false;
    }
}
