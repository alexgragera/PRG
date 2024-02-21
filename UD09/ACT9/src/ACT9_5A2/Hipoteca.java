package ACT9_5A2;

/**
 *
 * @author Alex
 */
public class Hipoteca extends ProducteBancari{
    private double comisApertura;
    private int nombrePeriodes;
    
    public Hipoteca(String codiProducte,String nom,double importContractat,double interesPeriode,double comisApertura,int nombrePeriodes){
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }
    
    @Override
    public double calculaRemuneracio(){
        return 0;
    }
}
