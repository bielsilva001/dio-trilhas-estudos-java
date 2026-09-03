
import java.util.Scanner;
import java.util.InputMismatchException;
import model.Livro;
import model.Usuario;
import service.BibliotecaService;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        BibliotecaService biblioteca = new BibliotecaService();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R Tolkien");
        Livro livro2 = new Livro("O Hobbit", "J.R.R Tolkien");

        System.out.println("======= Cadastro de Usuário =======");
        
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua matricula: ");
        int matriculaUsuario;
        try {
            matriculaUsuario = leitor.nextInt();
        } catch (InputMismatchException erro) {
            System.out.println("Matrícula inválida. Informe um número inteiro.");
            leitor.close();
            return;
        }

        Usuario aluno = new Usuario(nomeUsuario, matriculaUsuario);

        System.out.println("\n======= Menu de Livros Disponiveis =======");
        exibirLivro(1, livro1);
        exibirLivro(2, livro2);
        System.out.println("3 - Devolver o primeiro livro");
        System.out.println("Digite uma opção: ");
        int opcao;
        try {
            opcao = leitor.nextInt();
        } catch (InputMismatchException erro) {
            System.out.println("Opção inválida. Informe um número inteiro.");
            leitor.close();
            return;
        }
        
        System.out.println("\n======= PROCESSANDO EMPRESTIMO =======");

        if (opcao == 1) {
            biblioteca.realizarEmprestimo(livro1, aluno);
        } else if (opcao == 2) {
            biblioteca.realizarEmprestimo(livro2, aluno);
        } else if (opcao == 3) {
            biblioteca.realizarDevolucao(livro1);
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 3.");
        }

        leitor.close();
    }

    private static void exibirLivro(int numero, Livro livro) {
        String status = livro.isDisponivel() ? "disponível" : "emprestado";
        System.out.println(numero + " - " + livro.getTitulo() + " (" + status + ")");
    }
}
