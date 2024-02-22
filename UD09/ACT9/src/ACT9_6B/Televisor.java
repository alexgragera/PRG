package ACT9_6B;

/**
 *
 * @author winadmin
 */
public final class Televisor extends Electronic {

    public Televisor(int midaPantalla, String processador, int ram, int hdd, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(midaPantalla, processador, ram, hdd, nom, preu, consumEnergetic, garantiaMesos);
    }

    @Override
    public double calculaDescompte() {
        return (getMidaPantalla() > 40) ? 0.12 * getPreu() : 0.08 * getPreu();
    }

    @Override
    public String toString() {
        return "Televisor {" + super.toString() + "} Preu: " + super.getPreu() + " " + this.calculaDescompte();
    }
}
