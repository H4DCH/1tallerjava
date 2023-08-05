import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Cadena = JOptionPane.showInputDialog("Ingrese una frase o palabra");
        String Sinespacios = Cadena.replace(" ","");

        char[] letras = Sinespacios.toCharArray();

        int cantidad = letras.length;
        System.out.println(Sinespacios);
        System.out.println("Tiene " + cantidad + " caracteres");

    }
}