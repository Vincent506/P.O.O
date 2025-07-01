import java.util.Scanner;

import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente novoCliente =  new Cliente();
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar CLiente ");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Depositar ");
            System.out.println("0 - Sair");

            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Digite o nome do CLiente: ");
                    String nome = input.nextLine();
                    novoCliente.setNome(nome);
                    System.out.println("Digite o Saldo inicial da Conta: ");
                    double initialMoney = input.nextDouble();
                    novoCliente.setSaldo(initialMoney);
                    System.out.println("Digite uma numero pra acessar sua conta com no maximo 6 digitos");
                    int number = input.nextInt();
                    novoCliente.setNconta(number);
                    System.out.println("Cliente cadastrado com sucesso!!!");
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = input.nextDouble();
                    novoCliente.sacar(saque);
                    break;
                case 3:
                    System.out.println("Digite o valor do deposito");
                    double deposit = input.nextDouble();
                    novoCliente.depositar(deposit);
                    break;
                case 0:
                    System.out.println("Relatorio final");
                    System.out.println("Nome do Cliente: "+novoCliente.getNome());
                    System.out.println("Numero da conta: "+novoCliente.getNconta());
                    System.out.println("Saldo: R$ "+novoCliente.getSaldo());
                    System.out.println("Saindo....");
                    break;
            }
        }while (option!=0);
        input.close();
    }
}
