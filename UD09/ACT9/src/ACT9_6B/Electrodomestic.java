package ACT9_6B;

/**
 *
 * @author Alex
 */
public abstract class Electrodomestic extends Producte {

    private char classeEnergetica;

    public Electrodomestic(char classeEnergetica, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(nom, preu, consumEnergetic, garantiaMesos);
        this.classeEnergetica = classeEnergetica;
    }

    public char getClasseEnergetica() {
        return classeEnergetica;
    }

    public final double calculaSuplement() {
        double suplement = 0.0;
        if (classeEnergetica == 'A' || classeEnergetica == 'a') {
            suplement = getPreu() * 0.05;
        } else if (classeEnergetica == 'B' || classeEnergetica == 'b') {
            suplement = getPreu() * 0.1;
        } else if (classeEnergetica == 'C' || classeEnergetica == 'c') {
            suplement = getPreu() * 0.15;
        }
        return suplement;
    }

    @Override
    public String toString() {
        return super.toString() + ", clase energetica: " + classeEnergetica;
    }

    @Override
    public boolean equals(Object o) {
        Electrodomestic p = (Electrodomestic) o;
        return (p.getNom().equals(this.getNom()))
                && (p.getPreu() == (this.getPreu()))
                && (p.getConsumEnergetic() == (this.getConsumEnergetic()))
                && (p.getGarantiaMesos() == (this.getGarantiaMesos()))
                && (p.getClasseEnergetica() == (this.classeEnergetica));
    }
}
