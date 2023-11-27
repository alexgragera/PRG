package ACT6_2;

import java.util.ArrayList;

/**
 *
 * @author T.Vives
 */
public class Institut {

    public static void main (String[] args) {
        try {
            // M�duls
            Modul modul1 = new Modul();
            modul1.idModul = Modul.comptadorModuls++; modul1.nom = "Programaci�"; modul1.horesSetmanals=7;
            Modul modul2 = new Modul();
            modul2.idModul = Modul.comptadorModuls++; modul2.nom = "Gesti� de Base de Dades"; modul2.horesSetmanals=8;
            Modul modul3 = new Modul();
            modul3.idModul = Modul.comptadorModuls++; modul3.nom = "Llenguatge de Marques"; modul3.horesSetmanals=4;
            Modul modul4 = new Modul();
            modul4.idModul = Modul.comptadorModuls++; modul4.nom = "Sistemes d'Informaci�"; modul4.horesSetmanals=7;
            Modul modul5 = new Modul();
            modul5.idModul = Modul.comptadorModuls++; modul5.nom = "Entorns de Desenvolupament"; modul5.horesSetmanals=3;
            // Falta afegir els m�duls d'ASIX i SMX
            // ...
            
            // Cicle DAW
            Cicle cicle1 = new Cicle();
            cicle1.idCicle = Cicle.comptadorCicles++; cicle1.nom = "Desenvolupament Aplicacions Web"; cicle1.numAlumnes = 25; cicle1.moduls = new ArrayList<Modul>();
                
            cicle1.afegeixModul(modul1);
            cicle1.afegeixModul(modul2);
            cicle1.afegeixModul(modul3);
            cicle1.afegeixModul(modul4);
            cicle1.afegeixModul(modul5);
            
            Cicle cicle2 = new Cicle();
            cicle2.idCicle = Cicle.comptadorCicles++; cicle2.nom = "Administraci� de sistemes en xarxa"; cicle2.numAlumnes = 25; cicle2.moduls = new ArrayList<Modul>();
            // ...
            
            // Falta afegir el cicle d'SMX
            // ...

            // Mostrar
            System.out.println(cicle1.mostraCicle());
            System.out.println(cicle2.mostraCicle());
            // System.out.println(cicl3.mostraCicle());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
