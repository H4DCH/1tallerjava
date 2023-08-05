import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Escriba un numero para calcular el factorial");
        int NumeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero"));
        int numeroFactor = 1;
        for (int i =1  ; i<=NumeroUsuario;i++)
        {
            numeroFactor *= i;

        }
        JOptionPane.showMessageDialog(null,"El factorial de " +NumeroUsuario+ " es :" +numeroFactor);
    }
}