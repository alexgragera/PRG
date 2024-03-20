/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_0A;

/**
 *
 * @author alexg
 */
public class Persona {

    protected String nom;
    protected int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    @Override
    public String toString(){
        return "Nom :" + this.nom + ", edad: " + edat;
    }

}
