package model;

public class Aluno extends Usuario{
    private int matricula;
    private String curso;

    public void setMatricula(int matricula){this.matricula = matricula;}
    public int getMatricula(){return matricula;}
    public void setCurso(String curso){this.curso = curso;}
    public String getCurso(){return curso;}

    public Aluno(String nome, String email){
        super(nome, email);
        setCurso(curso);
        setMatricula(matricula);
    }

    @Override
    public void exibirPerfil(){
        String perfil = "===================ALUNO"+"==================="
        +"\n    Nome: "+getNome()
        +"\n    Email: "+getEmail()
        +"\n    Matricula: "+getMatricula()
        +"\n    Curso: "+getCurso();
        System.out.println(perfil);
    }
}
