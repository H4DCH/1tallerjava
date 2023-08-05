import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        JOptionPane.showMessageDialog(null,"Nombre en Minusculas :" +Nombre.toLowerCase());
        JOptionPane.showMessageDialog(null,"Nombre en Mayusculas :" +Nombre.toUpperCase());

    }
}