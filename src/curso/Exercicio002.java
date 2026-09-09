package curso;

import java.util.Scanner;

public class Exercicio002 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("-----------------------------------");
        System.out.println ("Bem vindo ao programa de verificar se é par ou impar");
        System.out.println ("-----------------------------------");

        System.out.println ("Digite um numero para verificar se é par ou impar: ");

        int numeroEscolhido = entrada.nextInt();

        // Condição para verificar se o numero é par ou impar

        if (numeroEscolhido % 2 ==0 ) {
            System.out.println ("O numero " + numeroEscolhido + " é par");
        } else {
            System.out.println ("O numero " + numeroEscolhido + " é impar");
        }

        int sucessor = numeroEscolhido + 1;
        int antecessor = numeroEscolhido -1;

        System.out.println("O sucessor do numero " + numeroEscolhido + " é " + sucessor);
        System.out.println ("O numero antecessor do numero " + numeroEscolhido + " é " + antecessor);
        
        entrada.close();
    } 
}
