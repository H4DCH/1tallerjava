import java.util.Arrays;
import java.util.spi.ToolProvider;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] Numeros = {2,3,5,80,80,2,20,30};
        int[]Norepetidos =new int[Numeros.length];

        int j,top=0;
        boolean Repetido;

        for (int i = 0;i<Numeros.length;i++){
        Repetido = false;
        j=0;
        while (!Repetido&& (j<top)){
            if (Numeros[i]==Norepetidos[j]){
                Repetido = true;
            }
            j++;
        }
        if (!Repetido){
            Norepetidos[top] = Numeros[i];
            top++;
        }
        }
        System.out.print("Arreglo Original :");
        for (int i = 0;i<Numeros.length;i++){
            System.out.print(Numeros[i]+" ");
        }
        System.out.println();
        System.out.print("Arreglo Sin Repetidos :");
        for (int i = 0;i<top;i++){
            System.out.print(Norepetidos[i]+" ");
        }
    }
}