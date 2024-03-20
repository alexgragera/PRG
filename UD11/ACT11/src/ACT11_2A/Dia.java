/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_2A;

import java.time.LocalDate;
import java.util.Queue;

/**
 *
 * @author alexg
 */
public class Dia {

    private LocalDate fecha;
    private Queue<String> tareas;

    public Dia(LocalDate fecha, Queue<String> tareas) {
        this.fecha = fecha;
        this.tareas = tareas;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    
}
