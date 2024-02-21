package ACT9_6A;

/**
 *
 * @author alexg
 */
public class Televisor extends Producte{

    public Televisor(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla) {
        super(nom, preu, consumEnergetic, garantiaMesos, midaPantalla);
    }
    
    @Override
    public double calculaDescompte() {
        if (getMidaPantalla() > 40) {
            return getPreu() * 0.12;
        } else if (getMidaPantalla() <= 40) {
            return getPreu() + 0.08;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Preu: " + getPreu() + ", Consumo Energetico: " + getConsumEnergetic() + ", Garantia Mesos:" + getGarantiaMesos() + ", Mida Pantalla: " + getMidaPantalla();
    }
}
