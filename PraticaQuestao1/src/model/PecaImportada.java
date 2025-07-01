package model;

public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    public void setTI(float taxaI){this.taxaImportacao = taxaI;}
    public float getTI(){return taxaImportacao;}
    
    public void setTF(float taxaF){this.taxaFrete = taxaF;}
    public float getTF(){return taxaFrete;}
    
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete){
        super(nome, custo, lucro);
        setTF(taxaFrete);
        setTI(taxaImportacao);
    }

    @Override
    public float calcularPreço() {
        return super.calcularPreço()+getTF()+getTI();
    }

    @Override
    public void exibir() {
        String mostrar = "==========================================="+
        "\nTipo da Peça: Importada"
        +"\nNome da Peça: "+getNome()
        +"\nValor da peça: R$"+calcularPreço()
        +"\nPreço de Fabrica: R$"+getCusto();

        System.out.println(mostrar);
    }
    
}
