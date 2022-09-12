package atividade2;

public class Dragoes extends ClasseChar {

    Double distancia;
    public void atacar(Double dano, Double distancia){
        this.dano = dano;

        this.dano = this.dano / distancia;
        System.out.println("DRAGAO ATACOU COM " + this.dano + " DE DANO");

    }
}
