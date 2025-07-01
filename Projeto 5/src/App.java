import java.util.Scanner;

import model.Lista;

public class App {
    public static void main(String[] args) throws Exception {
        Lista L = new Lista();
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nSISTEMA DE LISTA COM NUMEROS INTEIROS\n");
            System.out.println("1-definir tamanho da Lista");
            System.out.println("2-Adicionar numeros na lista");
            System.out.println("3-Remover numeros da lista");
            System.out.println("4-Buscar numeros na lista");
            System.out.println("5-Mostrar lista");
            System.out.println("0-Sair");
            System.out.println("Digite sua opção");
            option = input.nextInt();
            input.nextLine();


            switch (option){
                case 1:
                    System.out.println("Digite o tamanho da lista");
                    int tamanho = input.nextInt();
                    input.nextLine();
                    L.inicializar(tamanho);
                    System.out.println("Lista Criada");
                    break;
                case 2:
                    System.out.println("Digite o número");
                    int numero = input.nextInt();
                    L.adicionar(numero);
                    System.out.println("número adicionado");
                    break;
                case 3:
                    System.out.println("Digite o numero");
                    int trash = input.nextInt();
                    input.nextLine();
                    L.retirar(trash);
                    System.out.println("Numero removido com sucesso");
                    break;
                case 4:
                    System.out.println("Digite o numero ");
                    int number = input.nextInt();
                    input.nextLine();
                    if (L.buscar(number) == -1){
                        System.out.println("Elemento não encontrado");
                    }else {
                        int hunter = L.buscar(number);
                        System.out.println("O elemento "+number+" esta na posição"+hunter);
                    }
                    break;
                case 5:
                    System.out.println("Lista de numeros");
                    L.mostrar();
                    break;
                case 0:
                    System.out.println("Fechando o programa.....");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while (option != 0);
        input.close();
    }

    
}
