package model;

public class Produto extends Object {
    protected String descricao;
    protected double valor;
    protected double imposto;
    protected double taxa;
    
    public void setDescricao(String descricao){this.descricao = descricao;}
    public String getDescricao(){return descricao;}
    public void setValor(double valor){this.valor = valor;}
    public double getValor(){return valor;}
    public void setImposto(double imposto){this.imposto = imposto;}
    public double getImposto(){return imposto;}
    public double getTaxa(){return taxa;}
    public void setTaxa(double taxa){this.taxa = taxa;}
    
    public Produto(String description, double value){
        this.descricao = description;
        this.valor = value;
    }

    public void menu(){
        String exibir = "============================== MENU =============================="
        +"\n1 - Cadastrar Produto Estadual"
        +"\n2 - Cadastrar Produto Nacional"
        +"\n3 - Cadastrar Produto Importado"
        +"\n4 - Exibir Produtos Estaduais"
        +"\n5 - Exibir Produtos Nacionais"
        +"\n6 - Exibir Produtos Importados"
        +"\n7 - Exibir Todos os Produtos"
        +"\n0 - SAIR";
        System.out.println(exibir);
    }

    public void mostrar(){
        String veja = "----------------- Produto  ----------------- "
        +"\n Nome: "+descricao
        +"\n Preço: "+valor;

        System.out.println(veja);
    }

    public void limpar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
