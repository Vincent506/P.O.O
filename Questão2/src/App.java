import model.Funcionario;
import model.FuncionarioComissionado;


public class App {
    public static void main(String[] args) throws Exception {
        Funcionario primeiro = new Funcionario("Fabricio", 1200);
        FuncionarioComissionado segundo = new FuncionarioComissionado("Leandro", 1200);
        segundo.setComissao(20);

        String exibir = "Nome: "+primeiro.getNome()
        +"\nSalario: "+primeiro.getSalario();

        System.out.println(exibir);

        segundo.calcularSalarioTotal();

        String exibir2 = "Nome: "+segundo.getNome()
        +"\nSalario: "+segundo.calcularSalarioTotal();

        System.out.println(exibir2);


    }
}
