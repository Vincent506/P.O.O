package model;

public class Alunos {
    private String nome;
    private String matricula;
    private float [] notas;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setNotas(float []notas){
        this.notas = notas;
    }

    public float[] getNotas(){
        return notas;
    }


    //Um construtor deve ter o mesmo nome da Classe, por exemplo:

    public Alunos(){
        this.nome = "";
        this.notas = null;
        this.matricula = "";
    }


    public float media(float [] notas){
        float soma = 0;
        for (float cont : notas){
            soma+=cont;
        }
        float valor;

        valor = soma/4;

        return valor;
    }

    public boolean aproved(Alunos aluno){
        if (aluno.media(aluno.getNotas())>=5){
            return true;
        }else {
            return false;
        }
    }

    public void showAluno(Alunos aluno){
        System.out.println("Nome do Aluno: "+aluno.getNome());
        System.out.println("Matricula: "+aluno.getMatricula());
        System.out.println("Notas:");
        for (int i = 0; i<notas.length; i++){
            System.out.println(i+1+"° nota"+aluno.getNotas()[i]);
        }

        System.out.println("Media: "+aluno.media(aluno.getNotas()));
    }
}
