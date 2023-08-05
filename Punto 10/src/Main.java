// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] fibonacci = new int[20];
            fibonacci[0]=0;
            fibonacci[1]=1;

            for(int i = 2;i <20;i++){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }

        System.out.println("Los numeros son");

            for(int num : fibonacci){
            System.out.print(num+",");
        }



    }
}