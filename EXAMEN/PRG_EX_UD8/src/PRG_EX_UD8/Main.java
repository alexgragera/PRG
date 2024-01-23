package PRG_EX_UD8;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        try {
            TriangleRectangle tRectangle1 = new TriangleRectangle("Verd", 3, 4, 5, new Posicio(1,1));
            TriangleEquilater tEquilater1 = new TriangleEquilater("Blau", 3, 3, 3, new Posicio(1,1));

            //TriangleRectangle tt = (TriangleRectangle) t;
            System.out.println(tRectangle1.toString());
            System.out.println("�rea: " + tRectangle1.calculaArea());
            System.out.println("Per�metre: " + tRectangle1.calculaPerimetre());
            System.out.println("N�m. Costats: " + tRectangle1.calculaNCostats());
            System.out.println("Altura: " + tRectangle1.calculaAltura());

            System.out.println("-------------------------");
            
            System.out.println(tEquilater1.toString());
            System.out.println("�rea: " + tEquilater1.calculaArea());
            System.out.println("Per�metre: " + tEquilater1.calculaPerimetre());
                System.out.println("N�m. Costats: " + tEquilater1.calculaNCostats());
            System.out.println("Altura: " + tEquilater1.calculaAltura());
            
            System.out.println("-------------------------");
            
            if (tRectangle1.equals(tEquilater1))
                System.out.println("S�n iguals");
            else
                System.out.println("S�n diferents");
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
