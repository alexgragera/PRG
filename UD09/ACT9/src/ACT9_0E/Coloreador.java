package ACT9_0E;

/**
 *
 * @author winadmin
 */
interface Coloreador {
    void aplicarColor(String color);  // declarar, no implementar

    default String __toString() {  // m�tode propi de la interficie 'Colorear'
        return "Aix� �s un Coloreador";
    }

}
