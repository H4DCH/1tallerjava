import javax.swing.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random ramdon = new Random();
        int numero = ramdon.nextInt(1, 101);
        int numeroUsuario = 0;
        int cont = 0;

        JOptionPane.showMessageDialog(null, "Adivina el numero");
         numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));


        while (numeroUsuario != numero) {
            if (numero > numeroUsuario)
            {
                JOptionPane.showMessageDialog(null,"El numero es mayor");
                numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
            }else if (numero < numeroUsuario)
            {
                JOptionPane.showMessageDialog(null,"El numero es menor");
                numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));

            }
            cont ++;

        }
        JOptionPane.showMessageDialog(null,"Bien!!! , lo has intentado " +cont+ " veces" );
    }
}