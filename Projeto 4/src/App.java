import java.util.Scanner;

import model.Alunos;

public class App {
    public static void main(String[] args) throws Exception {
        Alunos aluno01 = new Alunos();
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastre o primeiro aluno");
        System.out.println("Digite o nome do Aluno: ");
        String nomealuno = input.nextLine();
        aluno01.setNome(nomealuno);
        System.out.println("Digite a matricula do "+nomealuno);
        String matriculaaluno = input.nextLine();
        aluno01.setMatricula(matriculaaluno);
        System.out.println("Digite as notas do "+nomealuno);
        float [] notasaluno = new float[5];
        for (int i=0; i<4; i++ ){
            System.out.println("nota "+(i+1));
            notasaluno[i] = input.nextFloat();
        }
        aluno01.setNotas(notasaluno);
        float mediaAluno = aluno01.media(aluno01.getNotas());

        aluno01.showAluno(aluno01);

        boolean aproved = aluno01.aproved(aluno01);

        if (aproved){
            System.out.println("O aluno "+aluno01.getNome()+" foi aprovado.\nmedia: "+mediaAluno);
        }else {
            System.out.println("Aluno"+aluno01.getNome()+" reprovado.\nmedia: "+mediaAluno);
        }
        input.close();
    }
}

