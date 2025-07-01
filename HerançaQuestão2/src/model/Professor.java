

package model;
import java.util.ArrayList;
import java.util.List;
public class Professor extends Usuario{
    private List<String> materias = new ArrayList<>();
    private String curso;

    public void setMaterias(String materias){this.materias.add(materias);}
    public List<String> getMaterias(){return materias;}
    public void setCurso(String curso){this.curso = curso;}
    public String getCurso(){return curso;}

    public Professor(String nome, String email){
        super(nome, email);
        setCurso(curso);
        setMaterias(null);
    }

    @Override
    public void exibirPerfil(){
        String perfil = "===================PROFESSOR"+"==================="
        +"\n    Nome: "+getNome()
        +"\n    Email: "+getEmail()
        +"\n    Curso: "+getCurso()
        +"\n    Lista de Materias: "+getMaterias();
        System.out.println(perfil);
    }
    
}
