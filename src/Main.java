import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int Numero1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int NUmero2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        System.out.println("Suma de los numeros : " +(Numero1+NUmero2));
        System.out.println("Resta de los numeros : " +(Numero1-NUmero2));
        System.out.println("Multiplicacion de los numeros : " +Numero1*NUmero2);
        System.out.println("Division de los numeros : " +Numero1/NUmero2);
        }
    }
