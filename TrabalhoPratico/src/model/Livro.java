package model;

import java.util.ArrayList;
import java.util.List;
public class Livro {
    private String isbn;
    private String titulo;
    private int qntcapitulos;
    private List<Capitulo> capitulos = new ArrayList<>(); 
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntcapitulos() {
        return qntcapitulos;
    }

    public void setQntcapitulos(int qntcapitulos) {
        this.qntcapitulos = qntcapitulos;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo capitulos) {
        this.capitulos.add(capitulos);
    }

    public Livro(String ISBN, String Titulo, int qntcapitulos){
        this.isbn = ISBN;
        this.titulo = Titulo;
        this.qntcapitulos = qntcapitulos;
    }

    public void addCapitulo(String titulo, int qntpaginas){
            int som = -1;
            Capitulo cap = new Capitulo(titulo, qntpaginas);
            som = model.Capitulo.novocap(qntpaginas);
            if (som>qntcapitulos) {
                getCapitulos().add(cap);
                som =cap.numero++;
            }else{
                System.out.println("Quantidade maxima de capitulos atingida");
            }
            
    }

    public int somaPagina(List<Capitulo> capitulos){
        int soma = 0;
        for (int i = 0; i < capitulos.size(); i++) {
            soma = soma +capitulos.get(i).getQntpaginas();
        }
        return soma;
    }

    public void exibirRelatorio(){
        String exibir = "=== RELATORITO DO LIVRO ==="
        +"\n Editora: "+ model.Constante.EDITORA
        +"\n ISBN: "+ getIsbn()
        +"\n Titulo: "+getTitulo();

        System.out.println(exibir);
        System.err.println("Capitulos: ");
        for (int i = 0; i < capitulos.size(); i++) {
            System.out.println(capitulos.get(i).exibir());
        }
        System.out.println("Quantidade de paginas totais: "+somaPagina(capitulos));
       
    }
}
