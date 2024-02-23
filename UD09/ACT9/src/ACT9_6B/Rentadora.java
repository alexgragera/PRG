package ACT9_6B;

/**
 *
 * @author Alex
 */
public class Rentadora extends Electrodomestic{
    private int capacitatCarrega;
    
    public Rentadora(int capacitatCarrega, char classeEnergetica, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(classeEnergetica, nom, preu, consumEnergetic, garantiaMesos);
        this.capacitatCarrega = capacitatCarrega;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public boolean equals(Object o){
        Rentadora r = (Rentadora) o;
        return super.equals(r) && (r.getCapacitatCarrega() == (this.capacitatCarrega));
    }

    public int getCapacitatCarrega() {
        return capacitatCarrega;
    }
    
}
