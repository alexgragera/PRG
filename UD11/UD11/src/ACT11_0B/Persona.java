package ACT11_0B;

import java.util.Objects;

/**
 *
 * @author winadmin
 */
public class Persona {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nom.equals(persona.nom) && edat == persona.edat;
    }

    // tamb� es pot definir el m�tode gen�ric seg�ent
    @Override
    public int hashCode() {
        return Objects.hash(nom, edat);
    }
}

