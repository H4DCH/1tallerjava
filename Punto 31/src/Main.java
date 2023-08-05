import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[]numero = {2,100,1,80,90,500,0,-1};
        Arrays.sort(numero);

        System.out.print("Array ordenado de manera ascendente :");
        for (int i =0;i<numero.length;i++){
            System.out.print(numero[i]+ " ");
        }

    }
}