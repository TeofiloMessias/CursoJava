package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom dia!");
        System.out.println("Bom dia!\n\n");

        System.out.println("Bom");
        System.out.println("Bom dia!");

       System.out.printf("Megasena: %d %d %d %d %d %d %n",1,2,3,4,5,6);

        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "Joao");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é a sua idade ?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o \\n que o teclado.nextInt() deixa para trás

        System.out.println("Digite o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Digite o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        System.out.println("\n\nNome = " + nome +" "+ sobrenome);

        teclado.close();

    }
}
