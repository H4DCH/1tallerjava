import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Frase = JOptionPane.showInputDialog("Ingrese una frase");
        String[] Palabras = Frase.split("\\s+");

        for (int i=0;i<Palabras.length;i++) {
            System.out.println(Palabras[i]);
        }

    }
}