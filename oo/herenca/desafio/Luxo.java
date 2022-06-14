package oo.herenca.desafio;

public interface Luxo {
    void ligarAr();
    void deligarAr();

    default int velocidadeDoAr(){
        return 1;
    }
}
