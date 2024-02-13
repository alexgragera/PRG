package ACT9_3;

/**
 *
 * @author winadmin
 */
public class Automobil extends Vehicle {
    private int numPortes;
    private double capacitatMaleter;

    public Automobil(String marca, String model, double preu, String tipus, int numPortes, double capacitatMaleter) {
        super(marca, model, preu, tipus);
        this.numPortes = numPortes;
        this.capacitatMaleter = capacitatMaleter;
    }

    @Override
    public double calculaImpost() {
        return getPreu() * 0.1; // Impost del 10%
    }
    
}