/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT11_2A;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author winadmin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Dia> agenda = new HashSet<>();
        Agenda a = new Agenda(agenda);

        a.afegeixDia(LocalDate.of(2024, 03, 26), "tarea1", "tarea2", "tarea3");
        a.afegeixDia(LocalDate.of(2024, 03, 27), "tarea1", "tarea2", "tarea3");
        a.afegeixDia(LocalDate.of(2024, 03, 26), "tarea4", "tarea5", "tarea6");

        
        
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));
        System.out.println(a.obteTasca(LocalDate.of(2024, 03, 26)));

    }

}
