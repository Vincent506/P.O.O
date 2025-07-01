package model;

public class Cliente {
    private String nome;
    private double saldo;
    private int nconta;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNconta( int nconta){
        this.nconta = nconta;
    }

    public int getNconta(){
        return nconta;
    }

    public void sacar(double value){
        saldo-=value;
    }

    public void depositar(double value){
        saldo+=value;
    }
}
