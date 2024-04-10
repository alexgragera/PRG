/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_4;


import java.util.List;

/**
 *
 * @author alexg
 */
public class Llibre {

    private int ID;
    private String títol;
    private String autor;
    private int anyPublicacio;
    private List<Anomalia> anomalies;

    public Llibre(int ID, String títol, String autor, int anyPublicacio) {
        this.ID = ID;
        this.títol = títol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }

    public String getTítol() {
        return títol;
    }

}
