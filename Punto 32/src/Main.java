import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] Numeros = {1,26,54,23,2,0,30,23};
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para buscarlo en el array"));
        boolean Noes=false;
        for (int i =0;i<Numeros.length;i++){
                if (Numeros[i]==Numero){
                    System.out.println("El numero se encontro en el indice "+ i);
                    Noes=true;
                }
        }
        if (!Noes){
            System.out.println("El numero no fue encontrado");
        }
    }
}