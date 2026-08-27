package model;

public class Usuario {
    // Atributos da classe Usuario
    private String nome;
    private int matricula;

    // Adicionando o construtor da classe
    public Usuario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Adicionando os metodos Getters (leitura)
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
