package ACT7_2;

/**
 *
 * @author T.Vives
 */
public class Compte {
    // El codi d'un compte est� format per 4 atribut: banc+oficina+dc+numCompte
    public String banc;  // codi banc: String 4 posicions
    public String oficina;  // codi oficina: String 4 posicions
    public String dc;  // digits control: String 2 posicions
    public String numCompte; // n�m compte: String 10 posicions
    public double saldo;  // no �s possible un valor negatiu per aquest atribut

    // Constructor
    
    public Compte(String banc, String oficina, String dc, String numCompte, double saldo) {
        this.banc = banc;
        this.oficina = oficina;
        this.dc = dc;
        this.numCompte = numCompte;
        this.saldo = saldo;
    }

    // M�todes espec�fics
    public void ingresa(double quantitat) {
        // ha d'incrementar la 'quantitat' al saldo del compte
        saldo += quantitat;
        System.out.println("Ingr�s de " + quantitat + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numCompte);
    }

    public void reintegra(double quantitat) {
        // ha de decrementar la 'quantitat' al saldo del compte. 
        // Si la quantitat �s superior al saldo cal donar un avis
        if (quantitat <= saldo) {
            saldo -= quantitat;
            System.out.println("Retirada de " + quantitat + " del compte " + banc + "-" + oficina + "-" + dc + "-" + numCompte);
        } else {
            System.out.println("Saldo insuficient " + saldo + " en el compte " + banc + "-" + oficina + "-" + dc + "-" + numCompte);
        }
    }
    
    // Getters i Setters
    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
        else
            throw new IllegalArgumentException("Import negatiu no �s possible.");
    }
    
}
