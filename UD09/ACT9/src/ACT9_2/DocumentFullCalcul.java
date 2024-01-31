package ACT9_2;

/**
 *
 * @author winadmin
 */
// Clase para representar un documento de hoja de c�lculo
public class DocumentFullCalcul implements Document {
    private String contingut;

    public DocumentFullCalcul(String contingut) {
        this.contingut = contingut;
    }

    @Override
    public void obreDocument() {
        System.out.println("Obrir document de Full c�lcul");
    }

    @Override
    public void tancaDocument() {
        System.out.println("Tancar document de Full c�lcul");
    }

    @Override
    public void guardaDocument() {
        System.out.println("Guardando documento de Full c�lcul");
    }
}