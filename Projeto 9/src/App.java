import java.util.Scanner;
import model.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Empregado funcionario [] = new Empregado[5];
        for(int i = 0; i<2; i++){
        System.out.println("Digite seu nome:");
        String rapaz = input.nextLine();
        System.out.println("Digite o seu sobrenome");
        String segundo = input.nextLine();
        System.out.println("Digite o salario: ");
        double dinheiro = Double.parseDouble(input.nextLine());
        funcionario[i] = new Empregado(rapaz, segundo, dinheiro);
        }
        for(int i = 0; i<2;i++){
            double valor = funcionario[i].getSalario();
            double valoraument = funcionario[i].aumento(valor);
            funcionario[i].setSalario(valoraument);
            funcionario[i].exibir();
        }
        input.close();
    }
}
