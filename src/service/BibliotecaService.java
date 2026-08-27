package service;

import model.Livro;
import model.Usuario;

public class BibliotecaService {

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println(
                "Sistema: Livro " + livro.getTitulo()
                + " foi alugado para o usuario "
                + usuario.getNome()
                + " com sucesso!"
            );
        } else {
            System.out.println(
                "Sistema: O livro " + livro.getTitulo()
                + " já está alugado."
            );
        }
    }
}
