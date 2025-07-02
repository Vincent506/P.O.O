
import model.Livro;

public class TesteLivro {
    public static void main(String[] args) throws Exception {
        Livro novo = new Livro("BLB11-20241.BCC", "Fim da Republica A Queda de Cezar",4);
        novo.addCapitulo("Até tu Brutus?", 10);
        novo.addCapitulo("Imperador Nero, o Pior Imperador", 20);
        novo.addCapitulo("Invasão dos povos Barbaros", 35);
        novo.addCapitulo("Roma em chamas", 27);
        novo.exibirRelatorio();
    }
}
