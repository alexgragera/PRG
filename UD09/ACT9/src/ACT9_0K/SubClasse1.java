package ACT9_0K;

/**
 *
 * @author gt
 */
class SubClasse1 implements Interficie {
    public int b1;
    public String b2;

    // Constructor
    public SubClasse1(int b1, String b2) {
        this.b1 = b1 * a1;
        this.b2 = b2;
    }
    
    // La SubClasse1 hereda autom�ticament el metodePerDefecte() de la interf�cie

    public int getB1() {
        return b1;
    }

    public String getB2() {
        return b2;
    }
}

