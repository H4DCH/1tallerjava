import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if (Edad>=18){
            JOptionPane.showMessageDialog(null  ,"Usted es mayor de edad");
        }else JOptionPane.showMessageDialog(null,"Usted es menor de edad");
    }
}