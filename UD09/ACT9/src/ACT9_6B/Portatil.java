package ACT9_6B;



/**
 *
 * @author winadmin
 */
public final class Portatil extends Electronic {

    public Portatil(int midaPantalla, String processador, int ram, int hdd, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(midaPantalla, processador, ram, hdd, nom, preu, consumEnergetic, garantiaMesos);
    }
   

    @Override
    public double calculaDescompte() {
        return (getConsumEnergetic() > 20) ? 0.15 * getPreu() : 0.10 * getPreu();
    }

    @Override
    public String toString() {
        return "Portàtil {" + super.toString() + "} Preu: " + super.getPreu() + " " + this.calculaDescompte();
    }
}