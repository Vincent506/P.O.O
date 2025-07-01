package model;

public class ProdutoNacional extends Produto{ 
    public ProdutoNacional(String Nome, double valor){
        super(Nome, valor);
        setTaxa(taxa);
    }

    @Override
    public void mostrar() {
        String veja = "----------------- Produto Nacional ----------------- "
        +"\n Nome: "+descricao
        +"\n Preço com imposto e taxa nacional: "+valor;
        System.out.println(veja);
    }
    
}
