package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Teofilo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia"
                .replace("X", "Teo")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        //Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);

    }
}
