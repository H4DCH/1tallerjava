import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));

        if(numero1>numero2){
            JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es mayor que " + numero2);
        }else if (numero2>numero1){
            JOptionPane.showMessageDialog(null,"El numero " + numero2 + " es mayor que " + numero1);
        } else  {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");

        }
    }
}