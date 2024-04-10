/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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

    public Biblioteca() {
        llibresDisponibles = new HashSet<>();
        llibresPrestats    = new LinkedList<>();
        titolsDisponibles  = new HashMap<>();
    }

    public void afegeixLlibre(int idLlibre, String titol, String autor, int anyPublicacio) {
        Llibre nouLlibre = new Llibre(idLlibre, titol, autor, anyPublicacio);
        this.llibresDisponibles.add(nouLlibre);

        if (!titolsDisponibles.containsKey(titol)) {
            this.titolsDisponibles.put(titol, new ArrayList<>());
        }
        this.titolsDisponibles.get(titol).add(nouLlibre);  // afegeix el 'llibre' a la llista de títols
    }
    
    public Llibre cercaLlibreDisponible(String titol){
       for (Llibre l : llibresDisponibles){
           if(titol.equals(l.getTítol())){
               return l;
           }
       }
        return null; 
    }
    
    public void prestaLlibre(String titol) {
        Llibre llibrePerPrestar = cercaLlibreDisponible(titol);
        if ( llibrePerPrestar != null) {
            this.llibresDisponibles.remove(llibrePerPrestar);
            this.llibresPrestats.offer(llibrePerPrestar);
        }
    }
    
    public void tornaLlibre() {
        Llibre llibreRetornat = llibresPrestats.poll();
        if (llibreRetornat != null) {
            llibresDisponibles.add(llibreRetornat);
        }
    }
    
    public void mostraLlibresDisponibles() {
        System.out.println("Llibres disponibles:");
        for (Llibre l : llibresDisponibles) {
            System.out.println(l.toString());
        }
    }
    
    public void mostraTitolsDisponibles() {
        System.out.println("Títols Disponibles:");
        for (String t : titolsDisponibles.keySet() ) {
            System.out.println(t + "-" + this.titolsDisponibles.get(t).toString());
        }
    }
    
    public void mostraLlibresPrestats() {
        System.out.println("Llibres prestats:");
        for (Llibre l : llibresPrestats) {
            System.out.println(l.toString());
        }
    }
}

