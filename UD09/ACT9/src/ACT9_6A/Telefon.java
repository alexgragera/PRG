package ACT9_6A;

/**
 *
 * @author alexg
 */
public class Telefon extends Producte {

    public Telefon(String nom, double preu, double consumElectric, int garantiaMesos, int midaPantalla) {
        super(nom, preu, consumElectric, garantiaMesos, midaPantalla);
    }

    @Override
    public double calculaDescompte() {
        if (getGarantiaMesos() < 6) {
            return getPreu() * 0.10;
        } else if (getGarantiaMesos() >= 5) {
            return getPreu() + 0.05;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Preu: " + getPreu() + ", Consumo Energetico: " + getConsumEnergetic() + ", Garantia Mesos:" + getGarantiaMesos() + ", Mida Pantalla: " + getMidaPantalla();
    }

}
