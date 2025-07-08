package model;

public class PassagemEstudante extends Passagem{
    

    public PassagemEstudante(String nome, double valor){
        super(nome, valor);
    }

    @Override
    double calcularvalor() {
        return super.calcularvalor()/2;
    }

    @Override
    public String toString() {
        String mostra = "Nome do Passageiro: "+getNomePassageiro()
        +"\nTipo: Estudante"
        +"\nValor: "+calcularvalor();
        return mostra;
    }
}
