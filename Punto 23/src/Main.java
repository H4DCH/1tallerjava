import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Frase = JOptionPane.showInputDialog("Ingrese una frase para saber cuantas letras tiene");
        String[]Palabras = Frase.split("\\s+");

        int Cantidad = Palabras.length;

        JOptionPane.showMessageDialog(null,"La frase tiene " + Cantidad +" palabras");

    }
}