package ACT9_2B;

/**
 *
 * @author winadmin
 */
public abstract class Telefon extends ValidadorDispositius implements DispositiuElectronic {
    private String marca;  // Marca del Tel�fon
    private Persona persona;  // Dades de la persona propiet�ria
    private boolean onOff;  // Enc�s o apagat
        
    public Telefon(String marca, Persona persona, boolean onOff) {
        this.marca = marca;
        this.persona = persona;
        this.onOff = onOff;
    }
    
    public boolean getOnOff() {
        return this.onOff;
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
