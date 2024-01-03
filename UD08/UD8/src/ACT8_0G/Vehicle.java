package ACT8_0G;

/**
 *
 * @author winadmin
 */
// Classe abstracta que representa un 'Vehicle'
abstract class Vehicle {
    int nrodes = 4;
    
    // Constructor

    public Vehicle(int nrodes) {
        this.nrodes = nrodes;
    }
    
    
    // M�tode concret que proporciona informaci� general del 'Veh�cle' 
    public void mostrarInformacionGeneral() {
        System.out.println("Aix� �s un veh�cle amb " + nrodes + " rodes.");
    }

    // M�todo abstracto que debe ser implementado por las clases concretas
    public abstract void mostrarDetalles();
}

