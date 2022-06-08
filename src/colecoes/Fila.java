package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Offer e Add -> adicionam elemento na fila

        // Diferença é o comportamento ocorre quando a fila esta cheia
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obter o próximo elemento da fila (sem remover)

        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); //retornal null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exeção
        System.out.println(fila.element());

        //Poll e Remove -> obter o próximo elemento da fila e remove

        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll());// retorna null
        System.out.println(fila.remove());//lança uma exeção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...)

    }
}
