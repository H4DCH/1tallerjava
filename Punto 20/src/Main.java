import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Cadena = JOptionPane.showInputDialog("Ingrese una palabra o frase");
        char[]ArrayCadena = Cadena.toCharArray();
        System.out.println("La cadena sin invertir es :" + Cadena);
        System.out.println("La cadena invertida es :");
        for (int i=Cadena.length()-1;i>=0;i--){
            System.out.print(ArrayCadena[i]);
        }

    }
}