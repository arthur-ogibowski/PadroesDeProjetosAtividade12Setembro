package atividade1;

public class Aniversario extends CartaoWeb {

    @Override
    public void showMessage(String destinatario) {
        System.out.println("Feliz aniversario " + destinatario + "!");
    }
}
