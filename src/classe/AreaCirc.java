package classe;

public class AreaCirc {
    double raio;
    double raioInicial;
    final static double PI = 3.1415;

    AreaCirc(){
        raio = raioInicial;
    }
    double area(){
        return PI * Math.pow(raio,2);
    }
}
