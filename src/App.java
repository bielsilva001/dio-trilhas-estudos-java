
import java.util.Scanner;
import model.Livro;
import model.Usuario;
import service.BibliotecaService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        BibliotecaService biblioteca = new BibliotecaService();

        // Criando os objetos iniciais 
        Livro livro1 = new Livro ("O Senhor dos Anéis", "J.R.R Tolkien");
        Livro livro2 = new Livro ("O Hobbit", "J.R.R Tolkien");

        System.out.println("======= Cadastro de Usuário =======");
        
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua matricula: ");
        int matriculaUsuario = leitor.nextInt();

        // Criando o objeto usuario com os dados digitados

        Usuario aluno = new Usuario(nomeUsuario, matriculaUsuario);

        // Menu de interação para escolher o livro
        System.out.println("\n======= Menu de Livros Disponiveis =======");
        System.out.println("1 - " + livro1.getTitulo());
        System.out.println("2 - " + livro2.getTitulo());
        System.out.println("Digite o número do livro que deseja alugar: ");
        int opcao = leitor.nextInt();
        
        System.out.println("\n======= PROCESSANDO EMPRESTIMO =======");

        if (opcao == 1) {
            biblioteca.realizarEmprestimo(livro1, aluno);
        } else if (opcao == 2) {
            biblioteca.realizarEmprestimo(livro2, aluno);
        } else {
            System.out.println("Opção inválida. Por favor, escolha opção 1 ou 2.");
        }

        leitor.close();

    }
}
