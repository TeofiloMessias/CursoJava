package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        Caixa<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());

        Caixa<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(123);
        System.out.println(caixaB.abrir());
    }
}
