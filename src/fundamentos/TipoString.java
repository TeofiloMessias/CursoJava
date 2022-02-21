package fundamentos;

import com.sun.javafx.binding.StringFormatter;

import java.util.Locale;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde!";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase(Locale.ROOT).startsWith("boa"));
        System.out.println(s.toUpperCase(Locale.ROOT).endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        //Poderia colocar var no lugar de String
        String nome = "Pedro";
        String sobronome = "Santos";
        int idade = 33;
        double salario = 12345.987;

        String maisUmaFrase = "Nome:" + nome + "\nSobrenome:"
                + sobronome + "\nIdade:" + idade +
                "\nSalario:" + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%2.f.",
        nome, sobronome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%2.f.",
                nome, sobronome, idade, salario);
        System.out.println(frase);

        System.out.println("Qualquer frase".contains("qualquer"));
        System.out.println("Qualquer frase".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6)); //pegando index 6
        System.out.println("Qualquer frase".substring(6,10));
    }
}
