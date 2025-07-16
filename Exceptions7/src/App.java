

public class App {
    public class Verfications{
        
        public static void processar()throws Exception{
            
                try{

                System.out.println("Criando um erro: ");
                throw new Exception("Erro criado");
                }catch(Exception error){
                    System.out.println("Erro capturado: "+error.getMessage());
                }
        }
    }
    public static void main(String[] args){

    }
}
