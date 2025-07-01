import java.util.Scanner;
import model.Fatura;

public class FaturaTeste {
    public static void main(String[] args) throws Exception {
        Fatura novaFatura  = new Fatura(null, null, 0, 0);
        Scanner input = new Scanner(System.in);
        int opção = -1;
        do{
            String menu = "MENU DE OPÇOES\n"
                +"1 - Adicionar item\n"
                +"2 - Buscar item\n"
                +"3 - Verificar quantidade de itens\n"
                +"4 - Verificar a fatura total\n"
                +"0 - Sair";
                System.out.println(menu);
                System.out.println("Digite a sua opção:");
                opção = input.nextInt();
                input.nextLine();
                switch (opção) {
                    case 1:
                    System.out.println("Digite o nome do Item:");
                    String name = input.nextLine();
                    System.out.println("Digite o numero de registro");
                    String number = input.nextLine();
                    System.out.println("Digite o preço");
                    double price = Double.parseDouble(input.nextLine());
                    System.out.println("Digite a quantidade");
                    Integer quant = Integer.parseInt(input.nextLine());
                    novaFatura = new Fatura(name, number, quant, price);
                        break;
                    case 2:
                    System.out.println("Digite o Registro do Produto");
                    String busca = input.nextLine();
                    if (novaFatura.buscar(busca)) {
                    String descrição = "Nome: "+novaFatura.getDescricao()+"\n"
                    +"Quantidade: "+novaFatura.getQuantidade()+"\n"
                    +"Preço: "+novaFatura.getPreco()+"\n"
                    +"Numero de Identificação: "+novaFatura.getNumero()+"\n";
                    System.out.println(descrição);
                    }else{
                        System.out.println("Produto não encontrado");
                    }
                        break;
                    case 3:
                    System.out.println("Digite o nome do item");
                    String item = input.nextLine();
                    String result = "Nome: "+item
                    +"\nQuantidade: "+novaFatura.getQuantidade();
                    System.out.println(result);
                        break;
                    case 4:
                    int quat = novaFatura.getQuantidade();
                    double valor = novaFatura.getPreco();
                    System.out.println("Valor da fatura total: R$ "+novaFatura.getTotalFatura(quat, valor));
                        break;
                    case 0:
                    System.out.println("Fechando o programa...");
                        break;
                
                    default:
                    System.out.println("Digite uma opção valida.");
                        break;
                }

        }while(opção!=0);
        input.close();
    }
}
