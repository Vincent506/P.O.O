package model;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Empregado(String name,String lastname, double money){
        this.nome = name;
        this.sobrenome = lastname;
        this.salario = money;
    }   

    public String getNome(){
        return nome;
    }
    
    public void setNome(String name){
        this.nome = name;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String lastname){
        this.sobrenome = lastname;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double value){
        this.salario = value;
    }

    public double aumento(double valor){
        double aum = valor+(valor*10/100);
        return aum;
    }

    public void exibir(){
        String exibicao = "Nome: "+getNome()
        +"\nSobrenome: "+getSobrenome()
        +"\nSalario: R$ "+getSalario();

        System.out.println(exibicao);
    }
}
