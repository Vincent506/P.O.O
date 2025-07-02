package model;

public class Capitulo {
    protected int numero;
    protected String titulo;
    protected int qntpaginas;
        public static int cont = -1;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntpaginas() {
        return qntpaginas;
    }

    public void setQntpaginas(int qntpaginas) {
        this.qntpaginas = qntpaginas;
    }


    public Capitulo(String Titulo, int quantidade){
        this.titulo = Titulo;
        cont++;
        this.numero = cont;
        this.qntpaginas = quantidade;

    }

    
    public static int novocap(int numero){
        numero = numero++;
        return numero;
    } 

    public String exibir(){
        String mostrar = "Capitulo "+ getNumero()+" - "+ getTitulo()+ "("+getQntpaginas()+" paginas)";
        return mostrar;
    }

    
}
