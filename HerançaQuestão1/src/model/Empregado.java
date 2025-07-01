package model;

public class Empregado extends Object{
    protected String Nome;
    protected String CPF;
    protected double Salario;
    public void setNome(String nome){this.Nome = nome;}
    public String getNome(){return Nome;}
    public void setCPF(String CPF){this.CPF = CPF;}
    public String getCPF(){return CPF;}
    public double getSalario(){return Salario;}
    public void setSalario(Double valor){this.Salario = valor;}
    public Empregado(String nome,String CPF, double salario){
        this.Nome = nome;
        this.CPF = CPF;
        this.Salario = salario;
    }
    public double calcularSalario(){
        return getSalario();
    }
}
