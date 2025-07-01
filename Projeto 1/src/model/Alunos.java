package model;

public class Alunos {
    private String nome;
    private String matricula;
    private float n1;
    private float n2;

    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public float getN1(){
        return n1;
    }
    public float getN2(){
        return n2;
    }
    
    public Alunos(String nome, String matricula, float n1, float n2){
        this.nome = "";
        this.matricula = "";
        this.n1 = 0;
        this.n2 = 0;
    }

    public float media(){
        return  (n1+n2)/2;
    }

    public boolean aproved(){
        if (media()>=5){
            return true;
        }else {
            return false;
        }
    }
}
