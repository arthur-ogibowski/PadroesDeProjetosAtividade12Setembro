package atividade2;

public class Bruxas extends ClasseChar {


    public void atacar(Double dano, Double vitalidade){
        this.dano = dano;
        this.vitalidade = vitalidade;

        this.dano = this.dano / this.vitalidade;
        System.out.println("BRUXA ATACOU COM " + this.dano + " DE DANO");

    }
}
