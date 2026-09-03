package service;

import model.Livro;
import model.Usuario;

public class BibliotecaService {

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        if (livro == null || usuario == null) {
            throw new IllegalArgumentException("Livro e usuário são obrigatórios.");
        }

        try {
            livro.emprestar();
            System.out.println(
                "Sistema: Livro " + livro.getTitulo()
                + " foi alugado para o usuario "
                + usuario.getNome()
                + " com sucesso!"
            );
        } catch (IllegalStateException erro) {
            System.out.println(
                "Sistema: O livro " + livro.getTitulo()
                + " já está alugado."
            );
        }
    }

    public void realizarDevolucao(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Livro é obrigatório.");
        }

        livro.devolver();
        System.out.println(
            "Sistema: Livro " + livro.getTitulo()
            + " foi devolvido com sucesso."
        );
    }
}
