import javax.swing.*;
import javax.swing.plaf.IconUIResource;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es primo o no"));
        int Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero para tener un rango"));
        if (Numero1==2){
            System.out.print(Numero1+ ", ");
        }
        for (int cont =Numero1; cont <=Numero2;cont++) {

            if ((cont+=1)%cont==0)
            {
                System.out.print(cont+" ,");
            }
        }
    }
}