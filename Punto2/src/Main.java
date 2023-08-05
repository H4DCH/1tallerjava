import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int Numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es par o inpar"));

        if (Numero1%2==0){
            JOptionPane.showMessageDialog(null,"El  numero es par");
        }else JOptionPane.showMessageDialog(null,"El  numero es inpar");

        }
    }
