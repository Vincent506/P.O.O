package model;

public class ProdutoEstadual extends Produto{
    public ProdutoEstadual(String descricao, double valor){
        super(descricao, valor);
        setImposto(imposto);
    }

    @Override
    public void mostrar() {
        String veja = "----------------- Produto Estadual ----------------- "
        +"\n Nome: "+descricao
        +"\n Preço com o imposto: "+valor;

        System.out.println(veja);
    }
}
