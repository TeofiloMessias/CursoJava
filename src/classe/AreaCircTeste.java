package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc();
        a1.raio = 10;

        AreaCirc a2 = new AreaCirc();
        a2.raio = 100;

        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
