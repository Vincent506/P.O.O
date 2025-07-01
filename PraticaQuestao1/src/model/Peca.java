package model;

public class Peca extends Object{
    protected String nome;
    protected float custo;
    protected float lucro;

    public void setNome(String nome){this.nome = nome;}
    public void setCusto(float custo){this.custo = custo;}
    public void setLucro(float lucro){this.lucro = lucro;}
    public String getNome(){return nome;}
    public float getCusto(){return custo;}
    public float getLucro(){return lucro;}

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.lucro = lucro;
        this.custo = custo;
    }

    public float calcularPreço(){
        float margem = custo-lucro; 
        return custo + margem;
    }

    public void exibir(){
        String mostrar = "==========================================="
        +"\nTipo da peça: Normal"
        +"\nNome da Peça: "+getNome()
        +"\nValor da peça: R$"+calcularPreço()
        +"\nPreço de Fabrica: R$"+getCusto();
        System.out.println(mostrar);
    }
    
    
}
