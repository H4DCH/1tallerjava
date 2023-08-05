import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                int[] arreglo = {1, 2, 3, 4, 5,6};
                int posiciones =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de posiciones a rotar"));

                int[] resultadoIzquierda = rotarIzquierda(arreglo, posiciones);
                System.out.println("Arreglo rotado hacia la izquierda: " + arrayToString(resultadoIzquierda));


                int[] resultadoDerecha = rotarDerecha(arreglo, posiciones);
                System.out.println("Arreglo rotado hacia la derecha: " + arrayToString(resultadoDerecha));
            }

            public static int[] rotarIzquierda(int[] arr, int k) {
                int n = arr.length;
                int[] resultado = new int[n];

                for (int i = 0; i < n; i++) {
                    int nuevaPosicion = (i + n - k) % n;
                    resultado[nuevaPosicion] = arr[i];
                }

                return resultado;
            }

            public static int[] rotarDerecha(int[] arr, int k) {
                int n = arr.length;
                int[] resultado = new int[n];

                for (int i = 0; i < n; i++) {
                    int nuevaPosicion = (i + k) % n;
                    resultado[nuevaPosicion] = arr[i];
                }

                return resultado;
            }

            public static String arrayToString(int[] arr) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    if (i < arr.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
                return sb.toString();
            }
        }