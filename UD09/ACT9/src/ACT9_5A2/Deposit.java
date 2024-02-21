package ACT9_5A2;

/**
 *
 * @author Alex
 */
public class Deposit extends ProducteBancari{
    private int nombrePeriodes;
    
    public Deposit(String codiProducte,String nom,double importContractat,double interesPeriode,int nombrePeriodes){
        super(codiProducte, nom, importContractat, interesPeriode);
        this.nombrePeriodes = nombrePeriodes;
    }
    
    @Override
    public double calculaRemuneracio(){
        return 0;
    }
}
