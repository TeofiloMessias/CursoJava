package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informações do funcionáario

        //Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas =2_991_798_103.01;

        //Tipo booleano
        boolean estadeFerias = false; // true

        //Tipo caractere
        char status ='A'; //ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numeros de viagens
        System.out.println(numerosDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados /vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias" + estadeFerias);
        System.out.println("Status: " + status);


    }
}
