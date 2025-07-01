package model;

import java.util.ArrayList;
import java.util.List;

public class CamaroteSuperior extends VIP{

     private List<String> localizacao = new ArrayList<>();
    private double valorAdicionalSuperior;
    
    public void setVAS(double valorAdicionalSuperior){this.valorAdicionalSuperior = valorAdicionalSuperior;}
    public double getVAS(){return valorAdicionalSuperior;}

    public void setLocalizacao(String localizacao){this.localizacao.add(localizacao);}
    public List<String> getLocalização(){return localizacao;}

    public CamaroteSuperior(double preco){
        super(preco);
        setVAS(valorAdicionalSuperior);
    }

    public void imprimeLocalização(){
        System.out.println("Local do Camarote Superior: "+getLocalização());
    }


    @Override
    public double getVIP() {
        preco = preco+valorAdicionalSuperior+valorAdicional;
        return preco;
    }
    
}
