package model;

public class Livro extends Object{
    private String titulo;
    private String autor;
    private int ano;

    public void setTitulo(String titulo){this.titulo = titulo;}
    public String getTitulo(){return titulo;}
    public void setAutor(String autor){this.autor = autor;}
    public String getAutor(){return autor;}
    public int getAno(){return ano;}
    public void setAno(int ano){this.ano = ano;}

    public Livro(String autor, String titulo, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String exibir(Livro livro){
        String exibir = "Titulo: "+livro.getTitulo()
        +"\nAutor: "+livro.getAutor()
        +"\nAno: "+livro.getAno();
        return exibir;
    }
    

}
