package model;

public class EmpregadoComissionadoComBase extends EmpregadoComissionado {
    protected double salariobase = 1450;
    public void setSalarioBase(double valor){this.salariobase = valor;}
    public double getSalarioBase(){return salariobase;}
    public EmpregadoComissionadoComBase(String nome, String CPF, double Salario){
        super(nome, CPF, Salario);
        setSalarioBase(Salario);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase()+((getPercentual()/100)*getVendas())*(getSalarioBase());
    }
}
