package ACT9_6A;

/**
 *
 * @author alexg
 */
public class Portatil extends Producte{

    public Portatil(String nom, double preu, double consumEnergetic, int garantiaMesos, int midaPantalla) {
        super(nom, preu, consumEnergetic, garantiaMesos, midaPantalla);
    }
    
    @Override
    public double calculaDescompte() {
        if (getConsumEnergetic() > 20) {
            return getPreu() * 0.15;
        } else if (getConsumEnergetic() <= 20) {
            return getPreu() + 0.1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Preu: " + getPreu() + ", Consumo Energetico: " + getConsumEnergetic() + ", Garantia Mesos:" + getGarantiaMesos() + ", Mida Pantalla: " + getMidaPantalla();
    }
}
