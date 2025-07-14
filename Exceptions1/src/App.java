import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public class DividirPorZero {
            
            public static int dividir(int numerador, int denominador) 
            throws ArithmeticException
            {
            return numerador/denominador;
            }
    }
            public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            boolean loop = true;
            do{
                try{
                System.out.println("Digite um numero inteiro: ");
                int primeiro = Integer.parseInt(input.nextLine());
                System.out.println("Digite outro numero inteiro: ");
                int segundo = Integer.parseInt(input.nextLine());
                int result = DividirPorZero.dividir(primeiro, segundo);

                String mostrar = "O resultado da divisão entre o numero: "+primeiro
                +" pelo "+segundo+" é "+result;

                System.out.println(mostrar);
                loop = false;
                }
                catch (InputMismatchException exception){
                    System.out.println("\nExceção:\n"+ exception.getMessage());
                    System.out.println("Você poderia digitar os numeros novamente? ");
                }catch(ArithmeticException case0){
                    System.out.println("\nExceção:\n"+case0.getMessage());
                    System.out.println("Você poderia digitar os numeros novamente? ");
                }
            }while(loop == true);
            input.close();
        }
    
}


