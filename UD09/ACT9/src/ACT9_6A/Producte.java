package ACT9_6A;

/**
 *
 * @author alexg
 */
public abstract class Producte {

    private String nom;
    private double preu;
    private double consumEnergetic;
    private int garantiaMesos;
    private int midaPantalla;

    public Producte(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla) {
        this.nom = nom;
        this.preu = preu;
        this.consumEnergetic = consumEnergetic;
        this.garantiaMesos = garantiaMesos;
        this.midaPantalla = midaPantalla;
    }

    public abstract double calculaDescompte();

    @Override
    public abstract String toString();

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getGarantiaMesos() {
        return garantiaMesos;
    }

    public void setGarantiaMesos(int garantiaMesos) {
        this.garantiaMesos = garantiaMesos;
    }

    public String getNom() {
        return nom;
    }

    public double getConsumEnergetic() {
        return consumEnergetic;
    }

    public int getMidaPantalla() {
        return midaPantalla;
    }

}
