package ACT9_3A;

/**
 *
 * @author winadmin
 */
// Clase abstracta PublicacionBase
abstract class PublicacioBase implements Publicacio {
    private String titol;
    private int anyPublicacio;

    public PublicacioBase(String titol, int anyPublicacio) {
        setTitol(titol);
        setAnyPublicacio(anyPublicacio);
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }
}