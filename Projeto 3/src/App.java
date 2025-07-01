import java.util.Scanner;
import view.EntradaDados;
import model.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Client Banco[] = new Client[200];
        int cont = 1;
        int option;

        do{
            System.out.println("=================================MENU=================================");
            System.out.println("1- Cadasstrar novo Cliente");
            System.out.println("2-Depositar");
            System.out.println("3-Sacar");
            System.out.println("4-Transferir");
            System.out.println("5-Mostrar Saldo");
            System.out.println("0-Sair");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                for(int i = 0; i<cont; i++){
                    if (Banco[i]==null) {
                        Banco[i] = EntradaDados.createClient(input);
                        cont++;
                    }
                }
                
                    break;

                case 2:
                System.out.println("Digite o IP do Cliente: ");
                int IP = input.nextInt();
                input.nextLine();
                System.out.println("Digite o valor do deposito:");
                double value = input.nextDouble();
                input.nextLine();
                Banco[IP].deposit(value);
                System.out.println("Deposito feito com sucesso.");
                    break;

                case 3:
                System.out.println("Digite o seu IP");
                int adress = input.nextInt();
                input.nextLine();
                System.out.println("Digite o valor da retirada: ");
                double saque = input.nextInt();
                input.nextLine();
                Banco[adress].retired(saque);
                System.out.println("Retirada de R$ "+saque+" Efetuada com sucesso");    
                    break;

                case 4:
                System.out.println("Digite o seu IP");
                int endereco = input.nextInt();
                input.nextLine();
                System.out.println("Digite o Valor da Transferencia");
                double transferir = input.nextDouble();
                input.nextLine();
                System.out.println("Digite o IP para quem quer transferir");
                int destino = input.nextInt();
                input.nextLine();
                Banco[endereco].transfer(transferir, Banco[destino]);
                System.out.println("Transferencia de R$ "+transferir+"Feita com sucesso");
                System.out.println("do cliente "+Banco[endereco].getNome()+" para "+Banco[destino]);
                    break;
                
                case 5:
                System.out.println("Digite seu IP ");
                int hm = input.nextInt();
                input.nextLine();
                Banco[hm].showValue();
                    break;

                case 0:
                System.out.println("Relatorio final");
                for(int i = 0; i<cont; i++){
                    Banco[i].report(Banco[i]);
                }

                System.out.println("Saindo.....");

                    break;
            
                default:
                System.out.println("Opção Invalida.");
                    break;
            }

        }while(option!=0);
        input.close();
    }
}
