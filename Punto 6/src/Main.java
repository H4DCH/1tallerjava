import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es naegativo o positivo :)"));

        if (numero > 0){
            JOptionPane.showMessageDialog(null ,"El numero " +numero +" es positivo");
        } else if (numero<0) {
            JOptionPane.showMessageDialog(null,"El numero " +numero+ " es negativo");
        }else JOptionPane.showMessageDialog(null,"El numero es " +numero);

    }
}