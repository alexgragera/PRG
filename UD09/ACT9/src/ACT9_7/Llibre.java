package ACT9_7;

/**
 *
 * @author alexg
 */
public class Llibre {

    private String titol;
    private String autor;
    private int anyPublicacio;
    private double preu;

    public Llibre(String titol, String autor, int anyPublicacio, double preu) {
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.preu = preu;
    }

    public String getTitol() {
        return titol;
    }
    
    /*
    @return devuelve un String
    */
    @Override
    public String toString(){
        return "Titulo: " + this.titol + ", Autor: " + this.autor +
                ",A?o: " + this.anyPublicacio + ", Precio: " + this.preu;
    }
}
