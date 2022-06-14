package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
     // Pedro erda de Ana
    //  codigo sera herdado  via herança
   //   Ana mae = new Ana(); Não acessa com instancia
    void testeAcessos(){

        //System.out.println(mae.segredo); //privado
        //System.out.println(mae.facoDentroDeCasa);// so é visivel dentro do mesmo pacote
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);

    }

}
