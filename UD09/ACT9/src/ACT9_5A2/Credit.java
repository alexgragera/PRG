package ACT9_5A2;

/**
 *
 * @author Alex
 */
public class Credit extends Tarjeta{
    private double importNegatiu;
    
    public Credit(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra,double importNegatiu) {
        super(codiTarjeta, comisUs, importMaximCaixer, importMaximCompra);
        this.importNegatiu = importNegatiu;
    }
    
}
