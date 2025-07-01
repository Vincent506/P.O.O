package model;

public class VIP extends Ingressos {
    protected double valorAdicional;

    public void setValorAdicional(double valorAdicional){this.valorAdicional = valorAdicional;}
    public double getValorAdicional(){return valorAdicional;}

    public VIP(double preco){
        super(preco);
        setValorAdicional(valorAdicional);
    }

    public double getVIP(){
        preco = preco+valorAdicional;
        return preco;
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso VIP");
    }
    

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso com o adicional de VIP: R$"+getVIP());
    }


    
}
