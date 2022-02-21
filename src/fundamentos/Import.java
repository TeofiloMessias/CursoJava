package fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
        //O que esta dentro de java lang esta a dispossição e o que esta fora precisa fazer o import
        java.lang.String s = "Bom dia!";
        java.lang.System.out.println(s);

        String st = "Bom dia!";
        java.lang.System.out.println(st);

        Date d = new Date();
        System.out.println(d);

     //   JButton botao = new JButton();

    }
}
