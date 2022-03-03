package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // if(...) sentença; ou {bloco de código}
        // while (...) sentença; ou {bloco de código}
        // for (inicialização da variavel; expressão; modificação da variavél; ou {bloco de código}
        // do [sentença; ou {} while(...)

        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do{
            System.out.println("Você precisa falar as palavras magicas...");
            System.out.print("Quer Sair ?");
            texto = entrada.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));
        System.out.print("Obrigado");
        entrada.close();
    }
}
