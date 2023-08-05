// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] Numeros = {2,3,4,10,50,60,80,100,20};
        int Mayor = 0;
        for(int i = 0;i<Numeros.length;i++){
            if (Mayor<Numeros[i]){
                Mayor = Numeros[i];
            }
            System.out.print(Numeros[i] + ",");
        }
        System.out.println();

        System.out.println("El numero mayor  del array es : " +Mayor);


    }
}