import java.util.Random;
import java.util.Scanner;

public class App {

    public class Verfic{
        public static void vetores(int valor,int[] vetor)throws ArrayIndexOutOfBoundsException{
            if (valor>vetor.length||valor<0||valor == vetor.length) {
                throw new ArrayIndexOutOfBoundsException("O Numero "+ valor+" esta fora do escopo");
                
            }
        }
    }

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        boolean rodagem = true;

        int [] numeros = new int[5];
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            numeros[i] = aleatorio.nextInt(10);
        }
        do{
            try{
                System.out.println("Numeros: ");
                for (int numero : numeros) {
                    System.out.println(numero);
                }

                System.out.println("Digite a possição do numero que deseja selecionar: ");
                int position = Integer.parseInt(input.nextLine());
                Verfic.vetores(position, numeros);
                rodagem = false;
                System.out.println("A possiçao que voce digitou foi: "+position+" e o numero correspondente é: "+numeros[position]);

            }catch(ArrayIndexOutOfBoundsException error){
                System.out.println("Erro:  "+ error);
            }

        }while(rodagem);
        input.close();
    }
}
