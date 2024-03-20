/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_2A;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author alexg
 */
public class Agenda {

    private Set<Dia> dies;

    public Agenda(Set<Dia> dies) {
        this.dies = dies;
    }

    public Dia cercaDia(LocalDate data) {
        for (Dia d : dies) {
            if (d.getFecha().isEqual(data)) {
                return d;
            }
        }
        return null;
    }

    public void afegeixDia(LocalDate data, String... atasques) {
        Queue<String> tareas = new PriorityQueue();

        for (String a : atasques) {
            tareas.offer(a);
        }

        Dia dia = new Dia(data, tareas);
        this.dies.add(dia);
    }
}
