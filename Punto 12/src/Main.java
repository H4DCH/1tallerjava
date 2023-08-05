import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es primo o no"));
        boolean PrimooNo = true;

        for (int i = 2; i < Numero; i++) {
            if (Numero % i == 0) {
                PrimooNo = false;

            }
        }
        if (PrimooNo){
            System.out.println("El numero  es primo");
        }
        else System.out.println("El numero no es primo");


    }

}