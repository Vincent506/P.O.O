package model;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;
    public void setTI(double taxaImportacao){this.taxaImportacao = taxaImportacao;}
    public double getTI(){return taxaImportacao;}
    public ProdutoImportado(String descrcao, double valor){
        super(descrcao, valor);
        setTaxa(taxa);
        setTI(taxaImportacao);
    }

    @Override
    public void mostrar() {
        String veja = "----------------- Produto Importado ----------------- "
        +"\n Nome: "+descricao            
        +"\n Preço com o imposto, taxa nacional e taxa de importação: "+valor;

        System.out.println(veja);
    }
    
}
