package ACT9_0A;

/**
 *
 * @author winadmin
 */
class Quadrat implements FiguraGeometrica {
    private double costat;
    
    // Constructor
    void Quadrat(double costat) {
        this.costat = costat;
    }
    // No getters ni setters

    // Implementaci� del m�tode de la interficie per a calcular l'�rea del quadrat
    @Override
    public double calcularArea() {
        return Math.pow(costat, 2);
    }
      
}
