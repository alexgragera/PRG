package ACT9_2A;

/**
 *
 * @author winadmin
 */
public interface ValidadorDispositius {
 
    abstract void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre);
    abstract boolean validaPatrons(Object o);  // Validar Persona amb Dispositiu
 
}