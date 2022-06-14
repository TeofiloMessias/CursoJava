package oo.composicao.desafio;

public class Item {
    String nome;
   final Produto produto;
    final int quantidade;

    Item(Produto produto, int quantidade){
       this.produto = produto;
       this.quantidade = quantidade;
    }
}
