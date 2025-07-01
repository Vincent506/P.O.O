import java.util.Scanner;
import model.Data;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastre uma data:\nDigite o dia:");
        int primeiro = Integer.parseInt(input.nextLine());
        System.out.println("Digite o numero do mes:");
        int segundo = Integer.parseInt(input.nextLine());
        System.out.println("Digite o ano: ");
        int terceiro = Integer.parseInt(input.nextLine());
        Data saida = new Data(primeiro, segundo, terceiro);
        System.out.println("\nDATA CADASTRADA\n");
        saida.displayData();
        input.close();
    }
}
