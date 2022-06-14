package oo.herenca;

public class Jogador {//construtor inplicito, construtor padrão
   public int vida = 100;
   public int x;
   public int y;

    protected Jogador(int x, int y){
        this.x = x;
        this.y = y; //atomaticamente cria o arquivo ponto class

    }
    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);// Diferença de um jogador esta do outro dentro do tabuleiro
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX ==0 && deltaY == 1){
            oponente.vida -= 20;
            return true;
        }else if (deltaX == 1 && deltaY == 0){
            oponente.vida -= 20;
            return true;
        }else {
            return false;
        }
    }
    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
            case LESTE:
                x++;
            case SUL:
                y++;
            case OESTE:
                x--;
        }
        return true;
    }
}