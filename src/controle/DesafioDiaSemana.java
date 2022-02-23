package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do dia");
        String dia = entrada.next();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if ("Terça".equalsIgnoreCase(dia)|| "Terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("Quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("Quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("Sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("Sábado".equalsIgnoreCase(dia)|| "sabado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Dia invalido");
        }
        entrada.close();
    }

}

