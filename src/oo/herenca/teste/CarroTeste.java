package oo.herenca.teste;

import oo.herenca.desafio.Carro;
import oo.herenca.desafio.Civic;
import oo.herenca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        System.out.println(c2.velocidadeDoAr());

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
    }
}