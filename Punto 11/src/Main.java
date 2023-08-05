import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Ingrese la longitud de los tres lados de un triangulo");
        double Lado1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado"));
        double Lado2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
        double Lado3= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado"));

        double semp = (Lado1+Lado2+Lado3)/2;

        double Area = Math.sqrt(semp*(semp-Lado1)*(semp-Lado2)*(semp-Lado3));

        JOptionPane.showMessageDialog(null,"El area del triangulo es : " + Area);
    }
}