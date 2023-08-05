import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] Numeros = {1,1,2,3,4,5,6,7,7,8,8,8,8};
        Arrays.sort(Numeros);
        int cont = 0;
        int aux = Numeros[0];
        for (int i =0;i<Numeros.length;i++){
            if (aux==Numeros[i]){
                cont++;
            }else {
                System.out.println("El numero " + aux +" se repite " + cont + " veces");
                cont=1;
                aux=Numeros[i];
            }
        }
        System.out.println("El numero " + aux +" se repite " + cont + " veces");

    }
}