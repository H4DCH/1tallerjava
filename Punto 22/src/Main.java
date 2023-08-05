import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String Cadena = JOptionPane.showInputDialog("Ingrese una frase para verificar si es palindromo o no");
        char[] letrascadena = Cadena.toCharArray();

        int izq=0;
        int der=letrascadena.length-1;

        while (izq<der){
            if (letrascadena[izq]==letrascadena[der]){
                der --;
                izq++;
            }else System.out.println("La palabra no es palindroma");
            break;
        }
        if (izq==der){
            System.out.println("La palabra es palindroma");
        }


    }


}