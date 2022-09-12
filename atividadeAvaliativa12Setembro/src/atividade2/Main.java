package atividade2;

public class Main {

    public static void main(String[] args) {
        Orcs orc = new Orcs();
        orc.atacar(10.0, 5.0);

        Bruxas bruxas = new Bruxas();
        bruxas.atacar(10.0, 1.0);

        Dragoes dragoes = new Dragoes();
        dragoes.atacar(10.0, 2.0);
    }
}

