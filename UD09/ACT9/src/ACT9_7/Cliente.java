package ACT9_7;

import java.util.ArrayList;

/**
 *
 * @author alexg
 */
public class Cliente {

    private String nom;
    private String cognom;
    private ArrayList<Llibre> llibresPrestats;

    public Cliente(String nom, String cognom, ArrayList<Llibre> llibresPrestats) {
        this.nom = nom;
        this.cognom = cognom;
        this.llibresPrestats = llibresPrestats;
    }
    
    public void prestaLLibre(Llibre llibre){
        llibresPrestats.add(llibre);
    }
    
    public String toString(){
        String text = "Nombre: " + this.nom + ", Apellido: " + this.cognom + ", LLibres prestats: ";
        for (Llibre l : llibresPrestats){
            text += l.toString() + "\n\t";
        }
        return text;
    }
}
