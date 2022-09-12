package atividade1;

public class Main {

    public static void main(String[] args) {
        String[] usuarios = {"Adilson", "Ronaldo", "Joao Pedro"};

        for (String usuario : usuarios) {
            DiaDosNamorados diaDosNamorados = new DiaDosNamorados();
            Natal natal = new Natal();
            Aniversario aniversario = new Aniversario();

            diaDosNamorados.showMessage(usuario);
            natal.showMessage(usuario);
            aniversario.showMessage(usuario);
        }


    }
}
