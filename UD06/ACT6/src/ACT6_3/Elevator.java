package ACT6_3;

/**
 *
 * @author winadmin
 */
public class Elevator {
    
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public static int TOP_FLOOR = 5;
    public static int BOTTOM_FLOOR = 1;
    
    // M�todes espec�fics
    // modifica 'doorOpen'=true
    public void openDoor() {
        System.out.println("...Obrint la porta");
        doorOpen = true;
    }
    
    // modifica 'doorOpen'=false
    public void closeDoor() {
        System.out.println("...Tancant la porta");
        doorOpen = false;
    }
    
    // augmenta 'currentFloor' si ascensor no est� al darrer pis i la porta est� tancada
    public void goUp() {
        System.out.println("...Anant a d'alt");
        if (!doorOpen) {
            if (currentFloor < TOP_FLOOR) {
                currentFloor++;
            } else {
                System.err.println("No �s possible pujar, ja en el pis de d'alt");
            }
        } else {
            System.err.println("Porta oberta, cal tancar-la");
        }
        System.out.println("\tPis actual: " + currentFloor);
    }
    
    // disminueix 'currentFloor' si ascensor no est� al primer pis i la porta est� tancada
    public void goDown() {
        System.out.println("...Anant abaix");
        if (!doorOpen) {
            if (currentFloor > BOTTOM_FLOOR) {
                currentFloor--;
            } else {
                System.err.println("No �s possible baixar, ja en el pis de baix");
            }
        } else {
            System.err.println("Porta oberta, cal tancar-la");
        }
        System.out.println("\tPis actual: " + currentFloor);
    }
}
