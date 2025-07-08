package model;

public class Passagem {
    protected String nomePassageiro;
    protected double valorBase;

    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public Passagem(String nome, double valor){
        this.nomePassageiro = nome;
        this.valorBase =  valor;
    }

    double calcularvalor(){
        return valorBase;
    }

    public String toString(){
        String mostrar = "Nome do Passageiro: "+getNomePassageiro()
        +"\nTipo: normal"
        +"\nValor: "+calcularvalor();
        return mostrar;
    }
    
}
