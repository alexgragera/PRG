package ACT9_5A2;

/**
 *
 * @author Alex
 */
public abstract class ProducteBancari {
    private String codiProducte;
    private String nom;
    private double importContractat;
    private double interesPeriode;
    
    public ProducteBancari(String codiProducte,String nom,double importContractat,double interesPeriode ){
        this.codiProducte = codiProducte;
        this.nom = nom;
        this.importContractat = importContractat;
        this.interesPeriode = interesPeriode;
    }
    
    @Override
    public String toString(){
        return "ProducteBancari {" + "codiProducte=" + codiProducte + ", nom=" + nom + '}';
    }
    
    abstract double calculaRemuneracio();
}
