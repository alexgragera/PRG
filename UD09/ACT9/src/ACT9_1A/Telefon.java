package ACT9_1A;

/**
 *
 * @author winadmin
 */
public abstract class Telefon implements DispositiuElectronic {
    private String marca;  // Marca del Tel�fon
    private Persona persona;  // Dades de la persona propiet�ria
    private boolean onOff;  // Enc�s o apagat
    
    public Telefon(String marca, Persona persona, boolean onOff) {
        // super(); // No cal ja que la interf�cie no t� cap atribut
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
}
