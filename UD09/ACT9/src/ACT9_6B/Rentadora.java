package ACT9_6B;

/**
 *
 * @author Alex
 */
public class Rentadora extends Electrodomestic{
    
    public Rentadora(char classeEnergetica, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(classeEnergetica, nom, preu, consumEnergetic, garantiaMesos);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public boolean equals(){
        return super.equals() && (p.getClasseEnergetica.equals(this.classeEnergetica));
    }
}
