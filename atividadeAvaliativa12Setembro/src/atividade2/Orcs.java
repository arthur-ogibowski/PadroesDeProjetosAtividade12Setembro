package atividade2;

public class Orcs extends ClasseChar {

    Double peso;

    public void atacar(Double dano, Double peso){
        this.dano = dano;

        this.dano = this.dano * peso;
        System.out.println("ORC ATACOU COM " + this.dano + " DE DANO");

    }
}
