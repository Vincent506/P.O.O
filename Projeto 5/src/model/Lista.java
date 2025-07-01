package model;

public class Lista {
    private int vetor[];  //esse é um ponteiro para o vetor
    private int cont;
    private int max;  // número de elemnto do vetor
    public void inicializar(int max){
        cont = 0;
        vetor = new int[max];// necessário instanciar o vetor
        this.max = max;
    }

    public boolean verificVazio(){
        if (cont == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean verificCheia(){
        if(cont == max){
            return true;
        }else {
            return false;
        }
    }

    public void adicionar(int elemento){
        if (!verificCheia()){
            this.vetor[cont] = elemento;
            cont++;
        }else {
            System.out.println("Sua lista esta cheia ");
        }
    }

    public int buscar(int search){
        for (int i = 0; i<cont; i++){
            if (vetor[i]==search){
                return i;
            }
        }
        return -1;
    }

    public void retirar(int lixo){
        int pos = buscar(lixo);
        if (pos != -1){
            this.vetor[pos] = vetor[cont -1];
            cont--;
        }
    }

    public void mostrar(){
        if (!verificVazio()){
            for (int i = 0; i<cont; i++){
                System.out.print(vetor[i] + "|");
            }
        }else {
            System.out.println("\n A lista está vazia");
        }
    }

}
