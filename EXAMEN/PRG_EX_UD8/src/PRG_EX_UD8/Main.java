package PRG_EX_UD8;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Triangle> triangles = new ArrayList();
        try {
            TriangleRectangle tRectangle1 = new TriangleRectangle("Verd", 3, 4, 5, new Posicio(1,1));
            triangles.add(tRectangle1);
            TriangleEquilater tEquilater1 = new TriangleEquilater("Blau", 3, 3, 3, new Posicio(1,1));
            triangles.add(tEquilater1);

            for (Triangle t : triangles) {
                //TriangleRectangle tt = (TriangleRectangle) t;
                System.out.println(t.toString());
                System.out.println("�rea: " + t.calculaArea());
                System.out.println("Per�metre: " + t.calculaPerimetre());
                System.out.println("N�m. Costats: " + t.calculaNCostats());
                //System.out.println("Altura: " + tt.calculaAltura());
            }
            
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
