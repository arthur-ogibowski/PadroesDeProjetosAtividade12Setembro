package atividade1;

public class Natal extends CartaoWeb{

    @Override
    public void showMessage(String destinatario) {
        System.out.println("Feliz natal " + destinatario + "!");
    }
}
