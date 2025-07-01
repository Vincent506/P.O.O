package model;

public class Ingressos extends Object {
    protected double preco;

    public void setPreco(double preco){this.preco = preco;}
    public double getPreco(){return preco;}

    public Ingressos(double preco){
        this.preco = preco;
    }

    
    public void imprimeTipo(){
        System.out.println("Ingresso Normal");
    }


    public void imprimeValor(){
        System.out.println("Valor do Ingresso: R$ "+getPreco());
    }

   
    
}


