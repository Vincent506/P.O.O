import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public class Validation {
        public static void verificarInteiro(String inteiro)throws InputMismatchException{
            if (!inteiro.matches("\\d+")) {
                throw new InputMismatchException("O numero deve ser inteiro");
            }
        }
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean validation = true;

        do{
            try{
                String inteiro;
                System.out.println("Digite um numero inteiro: ");
                inteiro = input.nextLine();
                Validation.verificarInteiro(inteiro);
                validation = false;
                System.out.println("Voce digitou: "+inteiro);
                

            }catch(InputMismatchException error){
                System.out.println("Erro: "+error);
                validation = true;
            }


        }while(validation);
        input.close();
    }
}
