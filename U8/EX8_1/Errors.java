package EX8_1;

import java.util.Scanner;

public class Errors {

    public static void main(String[] args) {
        int NombrePosat;
        int[] numPars = new int[5];
        int NombresGuardats = 0;
        do {
            Scanner lector = new Scanner(System.in);
            System.out.println("Escriu un nombre par, en pots possar 5, si vols sortir posa del programa escriu 0");
            NombrePosat = lector.nextInt();
            if (comprovacioPar(NombrePosat) == true) {
                numPars[NombresGuardats] = NombrePosat;
                NombresGuardats++;
                if (NombresGuardats > 5) {
                    throw new IndexOutOfBoundsException();
                }
            }
        } while (NombrePosat != 0);
        System.out.println("Has sortit del programa");
    }

    public static boolean comprovacioPar(int NombrePosat) {
        if(NombrePosat % 2 == 0) {
            return true;
        } else {
            throw new ArithmeticException();
        }
    }


}
