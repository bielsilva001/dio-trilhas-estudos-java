package model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título do livro é obrigatório.");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("O autor do livro é obrigatório.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (!disponivel) {
            throw new IllegalStateException("O livro já está emprestado.");
        }

        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
