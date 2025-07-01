import java.util.Scanner;
import model.InteiroSet;

public class Inteiro {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        InteiroSet lista = new InteiroSet();

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numerode 0 a 100 a lista: ");
            lista.insereElemento(input.nextInt());
            // input.nextLine();
        }

        System.out.println(lista.toSetString());


        input.close();
    }
}