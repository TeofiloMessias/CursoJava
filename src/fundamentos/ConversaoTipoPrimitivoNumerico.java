package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // inplicita
        System.out.println(a);

        float b = (float)1.234567888888; //explicita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; //explicita (CAST)
        System.out.println(f);

    }
}
