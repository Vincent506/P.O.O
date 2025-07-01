package model;
public class Fatura {
    private String numero;
    private String descrição;
    private int quantidade;
    private double preco;

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getDescricao(){
        return descrição;
    }
    public void setDescricao(String descrição){
        this.descrição = descrição;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public Fatura(String descrit,String numero, int quantidade, double preco){
        this.descrição = descrit;
        this.numero = numero;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public boolean buscar(String chave){
        if (chave == getNumero()) {
            return true;
        }else{
        return false;
        }
    }


    public double getTotalFatura(int quantidade, double preco){
        double total = 0;
        total = quantidade*preco;
        if (total<0) {
            return 0;
        }else{
            return total;
        }
    }
   

}
