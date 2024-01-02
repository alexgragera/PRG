package ACT9_0E;


/**
 *
 * @author winadmin
 */
class Cercle implements Figura, Colorear {
    String color;
    double radi;
    
    // Constructor
    public Cercle(String color, double radi) {
        this.color = color;
        this.radi = radi;
    }
    
    // Implementaci� del m�tode de 'Figura'
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }
    
    // Implementaci� del m�tode de 'Colorear'
    @Override
    public void aplicarColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Color: " + color + " Radi: " + radi;
    }
}
