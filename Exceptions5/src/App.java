import java.util.Scanner;

public class App {
    public class Verications {
        public static void absurdAge(int number) throws IllegalArgumentException{
            if (number < 0 || number > 130) {
                throw new IllegalArgumentException("Essa idade é absurda, digite sua idade real ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pass = true;
        do{
            try{
                System.out.println("Digite a sua idade: ");
                int age = Integer.parseInt(input.nextLine());
                Verications.absurdAge(age);
                pass = false;
                System.out.println("Sua idade é: "+age);

            }catch(IllegalArgumentException error){
                System.out.println("Erro: "+error);
            }finally{
                if (pass == false) {
                    System.out.println("Fechando o programa...");
                }
            }


        }while(pass == true);
        input.close();
    }
}
