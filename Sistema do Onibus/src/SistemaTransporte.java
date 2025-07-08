import model.Passagem;
import model.PassagemEstudante;


public class SistemaTransporte {
    public static void main(String[] args) throws Exception {
        Passagem[] passagens = new Passagem[6];
        double padrão = 5;
        passagens[0] = new Passagem("pessoa1", padrão);
        passagens[1] = new Passagem("pessoa2", padrão);
        passagens[2] = new Passagem("pessoa3", padrão);
        passagens[3] = new PassagemEstudante("Aluno1", padrão);
        passagens[4] = new PassagemEstudante("Aluno2", padrão);
        passagens[5] = new PassagemEstudante("Aluno3", padrão);

       for (int i = 0; i < passagens.length; i++) {
            System.out.println(passagens[i].toString());
       };
    }
}
