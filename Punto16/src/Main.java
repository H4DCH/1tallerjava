import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero hasta donde desea la serie fibonacci"));

        int a=0,b=1;

        while(a<=Numero){
            System.out.print(a + " ");
            int NumeroSiguiente = a+b;
            a=b;
            b=NumeroSiguiente;
        }

    }
}