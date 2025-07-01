import model.Peca;
import model.PecaImportada;

public class App {
    public static void main(String[] args) throws Exception {
        Peca primeira = new Peca("Chave de Fenda", 4, 2);
        PecaImportada seguda = new PecaImportada("Chave de Boca", 3, 1, 2, 3);
        primeira.exibir();
        seguda.exibir();
    
    }
}
