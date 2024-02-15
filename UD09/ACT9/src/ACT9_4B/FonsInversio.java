package ACT9_4B;

/**
 *
 * @author Administrador
 */
public class FonsInversio extends ProducteBancari {
    double comisApertura;
    int nombrePeriodes;

    public FonsInversio(String codiProducte, String nom, double importContractat, double interesPeriode, double comisApertura, int nombrePeriodes) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }

    @Override
    double calculaRemuneracio() {
        return + (super.importContractat * super.interesPeriode * this.nombrePeriodes) - this.comisApertura;
    }
    
    
}