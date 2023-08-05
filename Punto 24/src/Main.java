import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Cadena = JOptionPane.showInputDialog("Ingrese una palabra o frase");
        String letra = JOptionPane.showInputDialog("Ingrese la letra para que quiere reemplazar");
        String Letrareemp = JOptionPane.showInputDialog("Ingrese la letra con la que quiere reemplazar");
        char carater = letra.charAt(0);
        char[] letras = Cadena.toCharArray();
        char carateremp = Letrareemp.charAt(0);

        System.out.println(Cadena);
        for (int i=0; i<letras.length;i++){

            if (letras[i]==carater){
                letras[i]=carateremp;
            }
        }
        for (int i=0; i<letras.length;i++){

            System.out.print(letras[i]);
        }

    }
}