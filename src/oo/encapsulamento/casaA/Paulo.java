package oo.encapsulamento.casaA;

public class Paulo {
    //pode usar a Ana como atributo de instancia ou atributo local

    Ana esposa = new Ana(); // atributo de onstancia

    void testesAcessos(){
      //  Ana esposa = new Ana();// atributo local

      //  System.out.println(esposa.segredo); //privado não pode ser visto mesmo dentro do mesmo pacote
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
