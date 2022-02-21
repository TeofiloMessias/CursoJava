package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        //TABELA VERDADE
        System.out.println("Tabela Verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela Verdade ou(OR)");
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || false);

        System.out.println("Tabela Verdade ou Exclusivo (xor)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela Verdade NOT");
        System.out.println(!true);
        System.out.println(!false);


    }
}
