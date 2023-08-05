// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[]Numeros  = new int[5];
            Numeros[0] = 1;
            Numeros[1] = 2;
            Numeros[2] = 3;
            Numeros[3] = 4;
            Numeros[4] = 5;
int suma = 0;
            for (int i = 0;i<Numeros.length;i++){
                suma += Numeros[i];
            }
        System.out.println("La suma de los numeros es :"+suma);

    }
}