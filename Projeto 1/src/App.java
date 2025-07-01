import java.util.Scanner;
import model.Alunos;
import model.Sistema;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Alunos Sala[] = new Alunos[100];
        int option = -1;
        Sistema  operation = new Sistema();
        do{
            operation.menu();
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    operation.cadastrar(Sala);
                    break;
                    case 2:
                    System.out.println("Digite a matricula");
                    String mat = input.nextLine();
                    operation.buscar(mat, Sala);
                    break;
                    case 3:
                    operation.listar(Sala);
                    break;
                    case 0:
                    System.out.println("Saindo do Sistema....");
                    break;
                default:
                System.out.println("Digite uma opção valida!");
                
                    break;
            }

        }while(option !=0);
        input.close();
    }
    
}
