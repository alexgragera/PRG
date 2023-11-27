package ACT6_1;

/**
 *
 * @author T.Vives
 */
public class Institut {

    public static void main (String[] args) {
        try {
            Cicle cicle = new Cicle("Desenvolupament Aplicacions Web", 25);
            Modul modul1 = new Modul("Programaci�", 1, 7);
            Modul modul2 = new Modul("Gesti� de Base de Dades",cicle.getIdCicle(), 8);
            Modul modul3 = new Modul("Llenguatge de Marques",cicle.getIdCicle(), 4);
            Modul modul4 = new Modul("Sistemes d'Informaci�", cicle.getIdCicle(), 8);
            Modul modul5 = new Modul("Entorns de Desenvolupament", cicle.getIdCicle(), 4);
            
            System.out.println(cicle.mostraCicle() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
