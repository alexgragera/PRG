package ACT6_1;

import java.util.ArrayList;

/**
 *
 * @author T.Vives
 */
public class Institut {

    public static void main (String[] args) {
        try {
            ArrayList<Modul> moduls = new ArrayList<>();
            
            Modul modul1 = new Modul("Programaci�", 7);
            Modul modul2 = new Modul("Gesti� de Base de Dades", 8);
            Modul modul3 = new Modul("Llenguatge de Marques", 4);
            Modul modul4 = new Modul("Sistemes d'Informaci�", 8);
            Modul modul5 = new Modul("Entorns de Desenvolupament", 4);
            
            /* Alta del Cicle i dels m�duls segons el contructor1
            Cicle cicle = new Cicle("Desenvolupament Aplicacions Web", 25);
            cicle.afegeixModul(modul1);
            cicle.afegeixModul(modul2);
            cicle.afegeixModul(modul3);
            cicle.afegeixModul(modul4);
            cicle.afegeixModul(modul5);
            */
            
            // Alta del Cicle i dels m�duls segons el contructor2
            moduls.add(modul1);
            moduls.add(modul2);
            moduls.add(modul3);
            moduls.add(modul4);
            moduls.add(modul5);
            Cicle cicle = new Cicle("Desenvolupament Aplicacions Web", 25, moduls);
            
            System.out.println(cicle.mostraCicle() );
            if (cicle.eliminarModul("Programaci�")) {
                System.out.println("'Programaci�' eliminat");
            }
            System.out.println(cicle.mostraCicle() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
