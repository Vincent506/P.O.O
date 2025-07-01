package model;

public class Usuario extends Object {
    protected String nome;
    protected String email;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void exibirPerfil(){
        String perfil = "===================USUARIO"+"==================="
        +"\n    Nome: "+getNome()
        +"\n    Email: "+getEmail();
        System.out.println(perfil);
    }

    
}
