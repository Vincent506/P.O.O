import model.Empregado;
import model.EmpregadoComissionado;
import model.EmpregadoComissionadoComBase;


public class App {
    public static void main(String[] args) throws Exception {
        Empregado primeiro = new Empregado("Fabricio", "1234567", 1450);

        String normal = "Nome: "+primeiro.getNome()
        +"\nCPF: "+primeiro.getCPF()
        +"\nSalario: R$ "+primeiro.calcularSalario();

        System.out.println("Funcionario Base\n\n"+normal);
        
        EmpregadoComissionado segundo = new EmpregadoComissionado("Mauricio", "7654321", 1450);

        segundo.setPercentual(10);
        segundo.setVendas(30);
        String bom = "Nome: "+segundo.getNome()
        +"\nCPF: "+segundo.getCPF()
        +"\nSalario: R$ "+segundo.getSalario()
        +"\nComissão: R$ "+segundo.calcularSalario();

        System.out.println("\nFuncionario Comissionado\n\n"+bom);

        EmpregadoComissionadoComBase terceiro = new EmpregadoComissionadoComBase("Fernando", "0123456789", 1450);
        terceiro.setPercentual(20);
        terceiro.setVendas(9);

        String otimo = "Nome: "+terceiro.getNome()
        +"\nCPF: "+terceiro.getCPF()
        +"\nNovo Salario de Comissão Extra: R$ "+terceiro.calcularSalario();

        System.out.println("\nFuncionario Comissionado com Base\n\n"+otimo);
        
    }
}
