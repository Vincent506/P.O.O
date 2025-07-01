
import model.Livro;


public class App {
    public static void main(String[] args) throws Exception {
        Livro[] livros = new Livro[5];

        for (int i = 0; i < 5; i++) {
            livros[i] = new Livro("Julio Cezar", "Imperador", 500);
        }

        for (int i = 0; i < 5; i++) {
            
            System.out.println(livros[i].exibir(livros[i])); 
        }

    }
}
