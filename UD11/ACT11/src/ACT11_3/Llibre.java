/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_3;

/**
 *
 * @author alexg
 */
public class Llibre {

    private int ID;
    private String t�tol;
    private String autor;
    private int anyPublicacio;

    public Llibre(int ID, String t�tol, String autor, int anyPublicacio) {
        this.ID = ID;
        this.t�tol = t�tol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }

    public String getT�tol() {
        return t�tol;
    }

}
