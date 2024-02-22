package ACT9_6B;

/**
 *
 * @author winadmin
 */
public final class Telefon extends Electronic {

    public Telefon(int midaPantalla, String processador, int ram, int hdd, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(midaPantalla, processador, ram, hdd, nom, preu, consumEnergetic, garantiaMesos);
    }

    @Override
    public double calculaDescompte() {
        return (getGarantiaMesos() < 6) ? 0.10 * getPreu() : 0.05 * getPreu();
    }

    @Override
    public String toString() {
        return "Telèfon {" + super.toString() + "} Preu: " + super.getPreu() + " " + this.calculaDescompte();
    }
}
