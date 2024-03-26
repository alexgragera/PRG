/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author alexg
 */
public class Biblioteca {

    private Set<Llibre> llibresDisponibles;
    private Queue<Llibre> llibresPrestats;
    private Map<String, List<Llibre>> titolsDisponibles;

    public Biblioteca(Set<Llibre> llibresDisponibles, Queue<Llibre> llibresPrestats, Map<String, List<Llibre>> titolsDisponibles) {
        this.llibresDisponibles = llibresDisponibles;
        this.llibresPrestats = llibresPrestats;
        this.titolsDisponibles = titolsDisponibles;
    }

    public void afegeixLlibre(int idLlibre, String titol, String autor, int anyPublicacio){
        Llibre llibre = new Llibre(idLlibre,titol,autor,anyPublicacio);
        List<Llibre> lista = new ArrayList();
        
        llibresDisponibles.add(llibre);
        
        lista.add(llibre);
        titolsDisponibles.put(titol, lista);
    }
    
    public Llibre cercaLlibreDisponible(String titol){
       for (Llibre l : llibresDisponibles){
           if(titol.equals(l.getTítol())){
               return l;
           }
       }
        return null; 
    }
    
    public void prestaLlibre(String titol){
        
    }
    
    public void tornaLlibre(){
        
    }
    
    public void mostraLlibresDisponibles(){
        
    }
    
    public void mostraTitolsDisponibles(){
        
    }
    
    public void mostraLlibresPrestats(){
        
    }
}

