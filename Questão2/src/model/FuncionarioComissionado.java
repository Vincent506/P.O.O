package model;

public class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public double getComissao(){return comissao;}
    public void setComissao(double valor){this.comissao = valor;}

    public FuncionarioComissionado(String nome, double salariobase){
        super(nome,salariobase);
    }

    public double calcularSalarioTotal(){
        return (salariobase*comissao/100)+salariobase;
    }
    
}
