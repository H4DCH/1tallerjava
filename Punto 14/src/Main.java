import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Ingrese un numero para saber si es perfecto");
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numeros"));
        int[]Divisoresnumeros = new int[Numero];

        for (int i=1;i<Numero;i++)
        {
            if (Numero%i==0){
                Divisoresnumeros[i] = i;
            }
        }
        int Suma =0;
        for (int i=0;i<Divisoresnumeros.length;i++){
                Suma +=Divisoresnumeros[i];
        }
        if (Suma==Numero)
        {
            JOptionPane.showMessageDialog(null,"El numero ingresado es perfecto");
        } else JOptionPane.showMessageDialog(null,"El numero ingresado no es perfecto");

        }


    }
