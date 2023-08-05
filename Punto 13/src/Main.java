import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      double Numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal"));
      double Decimales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de decimales a redondear"));

      double Numerorendo = Math.round(Numero*Math.pow(10,Decimales))/Math.pow(10,Decimales);

        System.out.println(Numerorendo);
    }
}