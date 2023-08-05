import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String Frase = JOptionPane.showInputDialog("ingrese un frase");

        String[]Palbras = Frase.split("\\s+");
        Arrays.sort(Palbras);

        System.out.println(Arrays.toString(Palbras));
    }
}