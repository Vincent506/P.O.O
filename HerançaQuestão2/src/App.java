import model.Professor;
import model.Administrador;
import model.Aluno;



public class App {
    public static void main(String[] args) throws Exception {
        
        Administrador adm1 = new Administrador("Rodrigo", "Rodriguin@br.com");
        String[] permited = new String[3];
        permited[0] = "Adicionar";
        permited[1] = "Mover";
        permited[2] = "Remover";
        for (int i = 0; i < permited.length; i++) {
            adm1.setPermissao(permited[i]);    
        }
        
        Professor prof1 = new Professor("Luis", "Luisin@br.com");
        String[] desciplinas = new String[3];
        desciplinas[0] = "Fundamentos de Circuito";
        desciplinas[1] = "Eletronica Analogica";
        desciplinas[2] = "Circuitos Digitais";
        for(int i = 0; i < desciplinas.length;i++){
            prof1.setMaterias(desciplinas[i]);
        }
        
        prof1.setCurso("Computer Science");
        Aluno aln1 = new Aluno("Vicente", "Vincent@br.com");
        aln1.setCurso("Computer Science");
        aln1.setMatricula(123456789);

        adm1.exibirPerfil();

        prof1.exibirPerfil();

        aln1.exibirPerfil();

    }
}
