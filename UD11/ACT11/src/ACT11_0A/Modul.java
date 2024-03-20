/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_0A;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexg
 */
public class Modul {

    protected String nom;
    protected int horesSetmanals;
    protected int comptadorModuls = 1;
    protected List<Persona> matricula = new ArrayList<>();
    
     public Modul(String nom, int horesSetmanals,List<Persona> matricula) {
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
        this.matricula = matricula;
    }

}
