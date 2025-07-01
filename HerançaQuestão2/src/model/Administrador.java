package model;

import java.util.ArrayList;
import java.util.List;


public class Administrador extends Usuario{
     private List<String> permissoes = new ArrayList<>();

    public void setPermissao(String permissoes){this.permissoes.add(permissoes);}
    public List<String> getPermissao(){return permissoes;}

    public Administrador(String nome, String email){
        super(nome, email);
        setPermissao(null);
    }

    @Override
    public void exibirPerfil(){
        String perfil = "===================ADMINISTRADOR"+"==================="
        +"\n    Nome: "+getNome()
        +"\n    Email: "+getEmail()
        +"\n    Lista de Permissões: "+getPermissao();
        System.out.println(perfil);
    }
}
