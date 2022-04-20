package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = sc.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[1] = sc.nextDouble();
        }
        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println(" A media é "+ media);

        sc.close();


    }

}
