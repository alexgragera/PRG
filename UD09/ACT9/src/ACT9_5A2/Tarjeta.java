package ACT9_5A2;

/**
 *
 * @author Alex
 */
public abstract class Tarjeta {
    private String codiTarjeta;
    private double comisUs;
    private double importMaximCaixer;
    private double importMaximCompra;
    
    public Tarjeta(String codiTarjeta,double comisUs,double importMaximCaixer,double importMaximCompra){
        this.codiTarjeta = codiTarjeta;
        this.comisUs = comisUs;
        this.importMaximCaixer = importMaximCaixer;
        this.importMaximCompra = importMaximCompra;

    }
    
    
}
