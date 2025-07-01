
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Produto;
import model.ProdutoImportado;
import model.ProdutoEstadual;
import model.ProdutoNacional;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opc = -1;
        Produto primario = new Produto(null, 0);

        List<ProdutoEstadual> estaduals = new ArrayList<>();
        int indexEst = 0;
        List<ProdutoNacional> nacionals = new ArrayList<>();
        int indexNac = 0;
        List<ProdutoImportado> importados = new ArrayList<>();
        int indexImp = 0;
        while (opc !=0) {
            primario.menu();
            opc = Integer.parseInt(input.nextLine());
            switch (opc) {
                case 1:
                ProdutoEstadual variavel = new ProdutoEstadual(null, 0);
                variavel.setImposto(10);
                double imp = variavel.getImposto()/100;
                System.out.println("Digite a descriçaõ do produto");
                String nome = input.nextLine();
                System.out.println("Digite o valor do produto");
                double preco = Double.parseDouble(input.nextLine());
                preco = preco+preco*imp;
                variavel = new ProdutoEstadual(nome, preco);
                estaduals.add(variavel);
                indexEst++;
                primario.limpar();
                System.out.println("\n  PRODUTO CADASTRADO COM SUCESSO \n");
                    break;
            
                    case 2:
            ProdutoNacional variavel2 = new ProdutoNacional(null, 0);
            variavel2.setImposto(10);
            variavel2.setTaxa(5);
            double tx = variavel2.getTaxa()/100;
            double imp2 = variavel2.getImposto()/100; 
            System.out.println("Digite a descriçaõ do produto");
            String nome2 = input.nextLine();
            System.out.println("Digite o valor do produto");
            double preco2 = Double.parseDouble(input.nextLine());
            preco2 = preco2+preco2*imp2+preco2*tx;
            variavel2 = new ProdutoNacional(nome2, preco2);
            nacionals.add(variavel2);
            indexNac++;
            primario.limpar();
            System.out.println("\n  PRODUTO CADASTRADO COM SUCESSO \n");
            break;

                case 3:
            ProdutoImportado variavel3 = new ProdutoImportado(null, 0);
            variavel3.setImposto(10);
            double imp3 = variavel3.getImposto()/100;
            variavel3.setTaxa(5);
            double tx2 = variavel3.getTaxa()/100;
            variavel3.setTI(5);
            double txi = variavel3.getTI()/100;
            System.out.println("Digite a descriçaõ do produto");
            String nome3 = input.nextLine();
            System.out.println("Digite o valor do produto");
            double preco3 = Double.parseDouble(input.nextLine());
            preco3 = preco3+preco3*imp3+preco3*tx2+preco3*txi;
            variavel3 = new ProdutoImportado(nome3, preco3);
            importados.add(variavel3);
            indexImp++;
            primario.limpar();
            System.out.println("\n  PRODUTO CADASTRADO COM SUCESSO \n");
            break;
            
                case 4:
                primario.limpar();
            for (int i = 0; i < indexEst; i++) {
                estaduals.get(i).mostrar();
            }
            
            break;
                
                case 5:
                primario.limpar();
            for (int i = 0; i < indexNac; i++) {
                nacionals.get(i).mostrar();
            }
            break;
            
                case 6:
                primario.limpar();
            for(int i = 0; i<indexImp; i++){
                importados.get(i).mostrar();
            }
            break;
            
                case 7:
                primario.limpar();
            for (int i = 0; i < indexEst; i++) {
                estaduals.get(i).mostrar();
            }
            for (int i = 0; i < indexNac; i++) {
                nacionals.get(i).mostrar();
            }
            for(int i = 0; i<indexImp; i++){
                importados.get(i).mostrar();
            }
            break;
            
                case 0:
            primario.limpar();
            System.out.println("Saindo do programa...");
            break;
                default:
                primario.limpar();
                System.out.println("Digite uma opção valida..");
                    break;
            }    
        }
        input.close();
    }
    
}
