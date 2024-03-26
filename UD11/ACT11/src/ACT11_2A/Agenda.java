/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT11_2A;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
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

    public void afegeixDia(LocalDate data, String... tasques) {
        Dia dia = cercaDia(data);
        if (dia == null) {
            Queue<String> tareas = new LinkedList<>();
            for (String a : tasques) {
                tareas.offer(a);
            }
            dia = new Dia(data, tareas);
            this.dies.add(dia);
        } else {
            // El día ya existe
            for (String tarea : tasques) {
                dia.getTareas().offer(tarea);
            }
        }
    }

    public String obteTasca(LocalDate data) {

        for (Dia d : dies) {
            if (d.getFecha().isEqual(data)) {
                return d.getTareas().poll();
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.dies);
        return hash;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Agenda a = (Agenda) o;
        return this.dies.equals(a.dies);
    }

}
