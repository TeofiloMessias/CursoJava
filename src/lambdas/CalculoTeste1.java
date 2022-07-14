package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo calculo = (Calculo) new Somar();
        System.out.println(calculo.executar(2,3));

        calculo = (Calculo) new Multicplicar();
        System.out.println(calculo.executar(2,3));
    }
}
