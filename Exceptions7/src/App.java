import java.util.InputMismatchException;

public class App {
    public class Verfications{
        
        public static void processar()throws InputMismatchException{
            
                try{

                System.out.println("Criando um erro: ");
                
                throw new InputMismatchException("Erro criado");
                }catch(Exception error){
                    System.out.println("Erro capturado: "+error.getMessage());
                }
        }
    }
    public static void main(String[] args){
        Verfications.processar();
    }
}
