package model;

public class Livro {
   
    // Adicionando atributos da classe Livro
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Adicionando o constutor da classe

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Por padrão, todo livro novo nasce disponivel
    }

    // Métodos Getters e Setters (Ação para leitura e escrita)
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
