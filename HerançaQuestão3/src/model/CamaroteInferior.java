package model;

import java.util.ArrayList;
import java.util.List;

public class CamaroteInferior extends VIP{
    private List<String> localizacao = new ArrayList<>();

    public void setLocalizacao(String localizacao){this.localizacao.add(localizacao);}

    public List<String> getLocalização(){return localizacao;}

    public CamaroteInferior(double preço){
        super(preço);
        setLocalizacao(null);
    }

    public void imprimeLocalização(){
        System.out.println("Local do Camarote Inferior: "+getLocalização());
    }


    
}
