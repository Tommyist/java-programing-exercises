package EX8_3;

import java.io.*;

public class Excepcions {

    public static void main(String[] args) {

        // Cridam IOException
        metodoIOException();

        // Cridam NullPointerException
        metodoNullPointerException();
    }

    public static void metodoIOException() {
        try {
            // Genera una exepcio al intenar trobar un archiu que no exist
            FileInputStream archivo = new FileInputStream("archivoQueNoExiste.txt");
        } catch (IOException e) {
            System.out.println("IOException capturada: " + e.getMessage());
        }
    }

    public static void metodoNullPointerException() {
        try {
            // Genera una exepcio "NullPointerException" per intentar accedir a un objecte que es null
            String cadena = null;
            cadena.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException capturada: " + e.getMessage());
        }
    }
}
