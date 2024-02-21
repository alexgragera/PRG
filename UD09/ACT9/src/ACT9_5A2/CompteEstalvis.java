package ACT9_5A2;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class CompteEstalvis extends ProducteBancari{
    private double comisMantCompte;
    private ArrayList<Tarjeta> tarjetes;

    public CompteEstalvis(String codiProducte,String nom,double importContractat,double interesPeriode,double comisMantCompte, ArrayList<Tarjeta> tarjetes) {
        super(codiProducte,nom,importContractat,interesPeriode);
        this.comisMantCompte = comisMantCompte;
        this.tarjetes = tarjetes;
    }

   
    @Override
    public double calculaRemuneracio(){
        return 0;
    }
}
