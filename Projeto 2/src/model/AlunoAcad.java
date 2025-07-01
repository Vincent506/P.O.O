package model;

public class AlunoAcad {
    private String nome;
    private float peso;
    private float altura;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }

    public float getAltura(){
        return altura;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public float calcularIMC(float altura, float peso){

        float IMC = peso/(altura*altura);

        return IMC;
    }

    public boolean verification(int idade){
        if (getIdade()>18){
            return true;
        }else {
            return false;
        }
    }
}
