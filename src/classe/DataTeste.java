package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 28;
        d1.mes = 05;
        d1.ano = 1974;

        Data d2 = new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2022;

        System.out.printf(d1.obterDataFormatada());
        System.out.println();
        System.out.printf(d2.obterDataFormatada());

    }
}
