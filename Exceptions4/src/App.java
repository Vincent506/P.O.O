import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public class Verication {
        public static void ehInteiro(String variable)throws InputMismatchException{
            if (!variable.matches("\\d+")) {
                throw new InputMismatchException("O numero deve ser inteiro");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean verific = true;
        do{
            try{
                System.out.println("Digite um numero inteiro");
                String number = input.nextLine();
                Verication.ehInteiro(number);
                verific = false;
                System.out.println("Voce digitou: "+number);

            }catch(InputMismatchException error){
                System.out.println("Erro: "+error);
                verific = true;
            }finally{
                if (verific == false) {
                    System.out.println("Encerramento do programa....");
                }
            }
            
        }while(verific == true);
        input.close();
    }
}
