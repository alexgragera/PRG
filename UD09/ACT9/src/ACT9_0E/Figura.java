package ACT9_0E;

/**
 *
 * @author winadmin
 */
interface Figura {
    double calcularArea();  // declarar, no implementar

    default String _toString() {  // m�tode per defecte: no es poden emprar els m�todes d''Object'
        return "Aix� �s una figura";
    }

}
