import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String contrasena = generarContrasenaAleatoria(8);
        System.out.println("Contraseña generada: " + contrasena);
    }

    public static String generarContrasenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder(longitud);
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indiceAleatorio);
            contrasena.append(caracterAleatorio);
        }

        return contrasena.toString();
    }
    }