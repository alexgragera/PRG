package ACT9_0E;

/**
 *
 * @author winadmin
 */
interface Coloreador {
    void aplicaColor(String color);  // declarar, no implementar

    default String __toString() {  // m�tode per defecte: no es poden emprar els m�todes d''Object'
        return "Aix� �s un Coloreador";
    }

}
