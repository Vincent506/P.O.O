package model;
import java.util.Scanner;

public class Sistema {
    private int cont;
    Scanner input = new Scanner(System.in);
    //cadastrar
    public void cadastrar(Alunos vetor[]){
        for (int i = 0; i<100; i++){
            if (vetor[i]==null){
                System.out.println("Digite o nome do Aluno: ");
                String nm = input.nextLine();
                System.out.println("Digite a Matricula do "+vetor[i].getNome()+": ");
                String mat = input.nextLine();
                System.out.println("Digite a primeira nota do "+vetor[i].getNome()+": ");
                float primeira = input.nextFloat();
                System.out.println("Digite a segunda nota do "+vetor[i].getNome()+": ");
                float segundo = input.nextFloat();
                vetor[i] = new Alunos(nm, mat, primeira, segundo);
                cont++;

                System.out.println("Cadastro feito com sucesso!!!\n\n");
            }else {
                System.out.println("Espaço cheio!!");
            }
        }
    }
    //buscar
    public int buscar(String matricula, Alunos vetor[]){
        int resultado = 0;
        for (int i = 0; i<cont; i++) {
            if (vetor[i].getMatricula() == matricula) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    //listar

    public void listar(Alunos vetor[]){
        for (int i = 0; i<cont ; i++){
            System.out.println("\n----------------------------------------------------------------------------------------");
            System.out.println("\nNome do aluno: "+vetor[i].getNome());
            System.out.println("Matricula: "+vetor[i].getMatricula());
            System.out.println("Notas: 1° "+vetor[i].getN1()+"\t2° "+vetor[i].getN2());
            System.out.println("Média: "+vetor[i].media());
            if (vetor[i].aproved()){
                System.out.println("O aluno "+vetor[i].getNome()+" foi aprovado");
            }else {
                System.out.println("Aluno "+vetor[i].getNome()+" reprovado.");
            }
        }
    }

    public void mostrar(int number, Alunos vetor[]){
        for (int i = 0; i<cont; i++){
            if (number == i) {
            System.out.println("\n----------------------------------------------------------------------------------------");
            System.out.println("\nNome do aluno: "+vetor[i].getNome());
            System.out.println("Matricula: "+vetor[i].getMatricula());
            System.out.println("Notas: 1° "+vetor[i].getN1()+"\t2° "+vetor[i].getN2());
            System.out.println("Média: "+vetor[i].media());
            break;
            }
        }
    }

    public void menu(){
        String menu = "MENU DE OPÇOES\n"
                +"1 - Cadastrar\n"
                +"2 - Buscar\n"
                +"3 - Listar\n"
                +"0 - Sair";
        System.out.println(menu);
    }
    
    public Sistema(){

    }


}
