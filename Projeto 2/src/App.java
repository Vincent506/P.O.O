import java.util.Scanner;

import model.AlunoAcad;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoAcad alunoAcad = new AlunoAcad();
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("SISTEMA DE CADASTRO DA ACADEMIA");
            System.out.println("1 - Cadastrar;");
            System.out.println("2 - Acessar;" );
            System.out.println("3 - Calcular IMC;");
            System.out.println("4 - Verificar idade;");
            System.out.println("0 - Sair");
            option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do Aluno: ");
                    String aluno = input.nextLine();
                    alunoAcad.setNome(aluno);
                    System.out.println("Digite a altura do "+alunoAcad.getNome());
                    float altura = input.nextFloat();
                    alunoAcad.setAltura(altura);
                    System.out.println("Digite a idade do "+alunoAcad.getNome());
                    int idade = input.nextInt();
                    alunoAcad.setIdade(idade);
                    System.out.println("Digite o peso do "+alunoAcad.getNome());
                    float peso = input.nextFloat();
                    alunoAcad.setPeso(peso);
                    System.out.println("Aluno "+alunoAcad.getNome()+" cadastrado com sucesso!!!");
                    break;
                case 2:

                        System.out.println("CADASTRO");
                        System.out.println("Nome: "+alunoAcad.getNome());
                        System.out.println("Idade: "+alunoAcad.getIdade());
                        System.out.println("Altura: "+alunoAcad.getAltura());
                        System.out.println("Peso: "+alunoAcad.getPeso());

                    break;
                case 3:

                        System.out.println("O IMC do Aluno: "+alunoAcad.getNome());
                        System.out.println("IMC: "+alunoAcad.calcularIMC(alunoAcad.getAltura(), alunoAcad.getPeso()));

                    break;
                case 4:

                        System.out.println("Digite a idade do Aluno: "+alunoAcad.getNome());
                        int vecIdade = input.nextInt();
                        input.nextLine();
                        if (alunoAcad.verification(vecIdade)){
                            System.out.println("O Aluno "+alunoAcad.getNome()+ " é maior de idade.");
                        }else {
                            System.out.println("O Aluno "+alunoAcad.getNome()+" é menor de idade.");
                        }

                    break;
                case 0:
                    System.out.println("Fechando o programa....");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while (option != 0);
        input.close();
    }
}

