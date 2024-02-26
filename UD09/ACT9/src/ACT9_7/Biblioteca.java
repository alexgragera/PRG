package ACT9_7;

import java.util.ArrayList;

/**
 *
 * @author alexg
 */
public class Biblioteca {
    private ArrayList<Llibre> llibres;

    public Biblioteca(ArrayList<Llibre> llibres) {
        this.llibres = llibres;
    }
    
    public void afegeixLlibre(Llibre llibre){
        llibres.add(llibre);
    }
    
    public Llibre cercaLlibre(String titol){
        for (Llibre l : llibres){
            if (l.getTitol().equals(titol)){
                return l;
            }
        }return null;
    }
    
    @Override
    public String toString(){
        String text = "";
        for (Llibre l : llibres){
           text +=  "\n" + l.toString();
        }
        return text;
    }
}
