package model;

public class Funcionario {
    private String nome;
    private String cod;
    private String funcao;
    private double salario;

    public void setCod(String codigo){
        this.cod = codigo;
    }

    public String getCod() {
        return cod;
    }

    public void setNome(String nomerec){
        this.nome = nomerec;
    }

    public String getNome(){
        return nome;
    }
    public void setFuncao(String funcionrec){
        this.funcao = funcionrec;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setSalario(double value){
        this.salario = value;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(){
        
    }

}
