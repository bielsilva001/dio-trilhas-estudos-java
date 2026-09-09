package curso;

import java.util.Scanner;

public class Exercicio001 {
   public static void main(String[] args) {

    // Criando codigo de aprendizado da tabuada

    Scanner entrada = new Scanner(System.in);
    // Criando o scanner para receber a entrada que o usuario digitou.

    System.out.println ("===================================");

    System.out.println ("Tabuada Facil");

    System.out.println ("===================================");

    System.out.println ("Digite um numero para ver a sua tabuada: ");

    int numeroEscolhido = entrada.nextInt();

    System.out.println ("\n Tabuada do " + numeroEscolhido + " ---");

    // Criando o laço de repetição para mostrar a tabuada do numero escolhido.

    for (int i = 1; i <= 10; i++) {

        int resultado = numeroEscolhido * i;

        System.out.println (numeroEscolhido + " x " + i + " = " + resultado);
    }

    entrada.close();
   }
}
