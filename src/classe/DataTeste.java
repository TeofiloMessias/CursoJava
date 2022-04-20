package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.ano = 2022;

        Data d2 = new Data(31,12,2020);

      String dataFormatada1 = d1.obterDataFormatada();

        System.out.printf(d1.obterDataFormatada());
        System.out.println();
        System.out.printf(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}
