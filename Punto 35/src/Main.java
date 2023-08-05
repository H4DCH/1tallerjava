 // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [][] tablas = new int[11][11];

        for (int i =0;i<tablas.length;i++){
            System.out.println("________________");
            System.out.println("Tabla del  " +i );
            for (int j=0;j<tablas.length;j++){
                tablas[i][j]=i*j;
                System.out.print(i+"*"+j+"="+tablas[i][j]);
                System.out.println();
            }
        }

    }
}