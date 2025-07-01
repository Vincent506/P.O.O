package model;

public class Funcionario extends Object {
    protected String nome;
    protected double salariobase;
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}
    public double getSalario(){return salariobase;}
    public void setSalario(Double valor){this.salariobase = valor;}

    public Funcionario(String nome, double salariobase){
        this.nome = nome;
        this.salariobase = salariobase;
    }
    
}
