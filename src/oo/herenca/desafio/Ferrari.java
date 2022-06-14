package oo.herenca.desafio;

public class Ferrari extends Carro implements Esportiva, Luxo {
    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidademaxima) {
        super(velocidademaxima);
        setDelta(15);

    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;

    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;

    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void deligarAr() {
        ligarAr = false;
    }
    @Override
    public int getDelta() {
           if (ligarTurbo && !ligarAr) {
                return 35;
            } else if (ligarTurbo && ligarAr) {
                return 30;
            } else if (!ligarTurbo && !ligarAr) {
               return 20;
            }else {
                return 15;
            }
        }
    }
//acelerar de 15 em 15 3* mais
//    @Override
//    void acelerar() {
//        super.acelerar();
//    }

