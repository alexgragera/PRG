package ACT9_6B;

/**
 *
 * @author Alex
 */
public abstract class Electronic extends Producte {

    private int midaPantalla;
    private String processador;
    private int ram;
    private int hdd;

    public Electronic(int midaPantalla, String processador,int ram,int hdd, String nom, double preu, double consumEnergetic, int garantiaMesos) {
        super(nom, preu, consumEnergetic, garantiaMesos);
        this.midaPantalla = midaPantalla;
        this.processador = processador;
        this.ram = ram;
        this.hdd = hdd;
    }

    public abstract double calculaDescompte();

    @Override
    public String toString() {
        return super.toString() + ", mida pantalla :" + midaPantalla
                + ", procesador: " + processador + ", ram : " + ram + ", hdd: " + ram;
    }

    public int getMidaPantalla() {
        return midaPantalla;
    }
}
