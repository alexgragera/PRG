package ACT9_0E;

/**
 *
 * @author winadmin
 */
interface Figura {
    double calcularArea();  // declarar, no implementar

    default String _toString() {  // m�tode propi de la interficie 'Colorear'
        return "Aix� �s una figura";
    }

}
