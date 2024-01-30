package ACT8_3;

/** Subclasse d'empleat: Compte pr�pia
 *
 * @author winadmin
 */
class EmpleatPerComptePropia extends Empleat {
    private int horesTreballades;

    // Constructor
    public EmpleatPerComptePropia(String nom, String llinatge1, double souPerHores, int horesTreballades) {
        super(nom, llinatge1, souPerHores);
        this.horesTreballades = horesTreballades;
    }

    /** Implementaci� del m�tode abstracte
     * 
     * @return double
     */
    @Override
    public double calculaSalari() {
        // El salario total para empleados por hora depende de las horas trabajadas
        return souBase * horesTreballades;
    }

    @Override
    public String toString() {
        return "Hores Treballades= " + horesTreballades;
    }
    
    
}

