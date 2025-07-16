import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public class Verications {
        public static void fileVerification(File file)throws IOException{
            if (!file.exists()) {
                throw new IOException("Insira um arquivo");
                
            }
            
        }
        
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean pass = true;
        do{
            try{
                
                File file = File.createTempFile("TempFile", ".tmp");
                Verications.fileVerification(file);
                System.out.println("Arquivo lido com sucesso: "+ file.getName());
                pass = false;
        
            }catch(IOException error){
                System.out.println("Erro: "+error.getMessage());
            }finally{
                if (pass ==  false) {
                    System.out.println("Fechando o programa...");
                }
            }

        }while(pass == true);
        input.close();
    }
}
