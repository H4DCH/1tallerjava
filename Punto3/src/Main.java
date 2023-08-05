import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer Radio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        double Area = Math.PI*Math.pow(Radio,2);
        JOptionPane.showMessageDialog(null,"El area del circulo es : "+Area);

        Double Perimetro = 2*Math.PI*Radio;

        JOptionPane.showMessageDialog(null,"El perimetro del circulo es : " +Perimetro);

        }
    }
