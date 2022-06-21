package stream;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Hpnda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

      //  UnaryOperator<String> maiuscula = n -> n.toUpperCase();  Usando a classe utilitarios
        UnaryOperator<String> primeraLetra = n -> n.charAt(0) + "";
      //  UnaryOperator<String> grito = n -> n + "!!!"; # Usando a classe utilitarios

        System.out.println("\n\nUsando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeraLetra)
                .map(Utilitarios::grito)// dentro da classe utilitários ele é um método
                .forEach(print);
    }
}
