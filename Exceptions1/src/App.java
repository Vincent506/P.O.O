import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public class DividirPorZero {
            
            public static int dividir(int numerador, int denominador) 
            throws ArithmeticException
            {
                if (denominador == 0) {
                    throw new ArithmeticException("Você poderia digitar os numeros diferentes de 0? ");
                }
            return numerador/denominador;
            }
            public static void inteiros(String number) throws InputMismatchException{
                if (!number.matches("\\d+")) {
                    throw new InputMismatchException("Você poderia digitar os numeros inteiros?");
                }
            }
            
    }
            public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            boolean loop = true;
            do{
                try{
                    String variable1;
                    String variable2;
                System.out.println("Digite um numero inteiro: ");
                variable1 = input.nextLine();
                DividirPorZero.inteiros(variable1);
                int numerador = Integer.parseInt(variable1);
                System.out.println("Digite outro numero inteiro: ");
                variable2 = input.nextLine();
                DividirPorZero.inteiros(variable2);
                int denominador = Integer.parseInt(variable2);
                int result = DividirPorZero.dividir(numerador, denominador);

                String mostrar = "O resultado da divisão entre o numero: "+numerador
                +" pelo "+denominador+" é "+result;

                System.out.println(mostrar);
                loop = false;
                }
                catch (InputMismatchException exception){
                    System.out.println("\nExceção numero 1:\n"+ exception.getMessage());
                }catch(ArithmeticException case0){
                    System.out.println("\nExceção numero 2:\n"+case0.getMessage());
                }
            }while(loop == true);
            input.close();
        }
    
}


