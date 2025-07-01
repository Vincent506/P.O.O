import model.Normal;
import model.VIP;

import java.util.Scanner;

import model.CamaroteInferior;
import model.CamaroteSuperior;

public class App {
    public static void main(String[] args) throws Exception {

        Normal ingNormal = new Normal(0);
        
        VIP ingVip = new VIP(0);

        CamaroteInferior CI = new CamaroteInferior(0);

        CamaroteSuperior CS = new CamaroteSuperior(0);

        Scanner input = new Scanner(System.in);

        String menu = "================== MENU =================="
        +"\n1 - Criar ingresso Normal;"
        +"\n2 - Criar ingresso VIP;"
        +"\n3 - Comprar ingresso Normal;"
        +"\n4 - Comprar ingresso VIP;"
        +"\n5 - Comprar Camarote;"
        +"\n0 - SAIR"
        +"\nDigite a sua opção";
        int opção = -1;

        while (opção != 0) {
            System.out.println(menu);
            opção = Integer.parseInt(input.nextLine());

            switch (opção) {
                    case 1:
                    System.out.println("Digite o preço do Ingresso");
                    double valor = Double.parseDouble(input.nextLine());
                   ingNormal = new Normal(valor);
                    break;
                    case 2:
                    System.out.println("Digite o preço do Ingresso");
                    double valor2 = Double.parseDouble(input.nextLine());
                    ingVip = new VIP(valor2);
                    ingVip.setValorAdicional(25);
                    break;
                    case 3:
                    ingNormal.imprimeTipo();
                    ingNormal.imprimeValor();
                    
                    break;
                    case 4:
                    ingVip.imprimeTipo();
                    ingVip.imprimeValor();
                    break;
                    case 5:
                    System.out.println("Qual tipo? 1- Camarote Inferior ou 2 - Camarote Superior");
                    int escolha = Integer.parseInt(input.nextLine());
                    if (escolha == 1) {
                        double padrao = 120;
                        CI.setPreco(padrao);
                        System.out.println("Escolha o Setor");
                        String setor = input.nextLine();
                        System.out.println("Escolha a fila");
                        String fila = input.nextLine();
                        CI.setLocalizacao(setor);
                        CI.setLocalizacao(fila);
                        System.out.println("Preço do Camarote Inferior: R$"+CI.getPreco());
                        CI.imprimeLocalização();
                    }else if (escolha == 2) {
                        double valoradd = 50;
                        CS.setVAS(valoradd);
                        CS.setPreco(120);
                        System.out.println("Escolha o Setor");
                        String setor2 = input.nextLine();
                        System.out.println("Escolha a fila");
                        String fila2 = input.nextLine();
                        CS.setLocalizacao(setor2);
                        CS.setLocalizacao(fila2);
                        System.out.println("Preço do Camarote Superior: R$"+CS.getVIP());
                        CS.imprimeLocalização();
                    }else{
                        System.out.println("Escolha uma opção valida");
                    }
                    break;
                    case 0:
                    System.out.println("Saindo do programa....");
                    break;
                default:
                System.out.println("Digite uma opção valida");
                    break;
            }
        }
        input.close();
    }
}
