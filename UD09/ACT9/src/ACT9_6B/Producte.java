package ACT9_6B;

/**
 *
 * @author winadmin
 */
public abstract class Producte {

    private String nom;
    private double preu;
    private double consumEnergetic;
    private int garantiaMesos;

    public Producte(String nom, double preu, double consumEnergetic, int garantiaMesos) {
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
    }

    @Override
    public String toString() {
        return "Producte {"
                + "Nom: " + nom
                + ", Preu: " + preu
                + ", ConsumEnergetic: " + consumEnergetic
                + ", GarantiaMesos: " + garantiaMesos + '}';
    }

    @Override
    public boolean equals(Object o) {
        Producte p = (Producte) o;
        return (p.getNom().equals(this.getNom()))
                && (p.getPreu() == (this.getPreu()))
                && (p.getConsumEnergetic() == (this.getConsumEnergetic()))
                && (p.getGarantiaMesos() == (this.getGarantiaMesos()));
    }
    // Getters i setters

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public double getConsumEnergetic() {
        return consumEnergetic;
    }

    public int getGarantiaMesos() {
        return garantiaMesos;
    }
}
