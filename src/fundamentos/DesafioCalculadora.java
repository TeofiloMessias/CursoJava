package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Informe o número 2: ");
        double num2 = sc.nextDouble();

        System.out.print("Informe a operação: ");
        String op = sc.next();

        //Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

       // System.out.printf("%.2f %s %2.f = %.2f", num1, op, num2, resultado);
        System.out.println("O resultado é "+ resultado);
        sc.close();
    }
}
