package model;
import java.lang.Math;

public class Utilidade {
    public static float media(float[] vet){
        float soma = 0;
        for (float index : vet) {
            soma = soma+index;
        }
        return soma/vet.length;
    }
 
    public static float soma(float[] vet){
        float soma = 0;
        for (float index : vet) {
            soma = soma+index;
        }
        return soma;
    }

    public static float maior(float[] vet){
        float maior = 0;
        for( float index : vet){
            if (index>maior) {
                maior = index;
            }
        }
        return maior;
    }

    public static float menor(float[] vet){
        float menor = maior(vet);
        for( float index : vet){
            if (index<menor) {
                menor = index;
            }
        }
        return menor;
    }

    public static int max( int a, int b){
        int maximo = -1;
        if (a>b) {
            maximo = a;
        }else if (a<b) {
            maximo = b;
        }else if (a == b) {
            maximo = -1;
        }
        return maximo;
    }

    public static double desviopadrao( float[] vet){
        double soma = 0;
        int i =0;
        int j =0;
        double variancia = 0;
        float media = media(vet);
        double[] diference = new double[vet.length];
        //A diferença entre cada valor pela media
        for(float index : vet){
            diference[i] = index - media;
            i++;
        }
        // o quadrado de cada media
        
        for(double index : diference){
            diference[j] = Math.pow(index, 2);
            j++;
        }
        //Calculo da Variancia
        for(double index : diference){
            soma = index+soma;
            variancia = soma/vet.length;
        }
        return Math.sqrt(variancia);
    }
}
