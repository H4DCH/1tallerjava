
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es capipua"));

        boolean esCapicua = esCapicua(numero);

        if (esCapicua) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        int numeroReverso = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero = numero / 10;
        }

        return numeroOriginal == numeroReverso;
    }


    }