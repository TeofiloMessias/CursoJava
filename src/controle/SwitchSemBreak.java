package controle;

import java.util.Locale;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "marrom";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "roxa":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "verde":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "laranja":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "vermelha":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
            case "amarela":
                System.out.println("Faixa preta - Sei o Bassai-Dai...");
                break;
            default:
            System.out.println("Não sei nada");
        }
        System.out.println("Fim!");
    }
}
