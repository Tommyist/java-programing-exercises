package EX4;

import java.util.Scanner;

public class ex4_16 {

	public static void main(String[] args) {
	    Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un numeru"); // Demanem el numero
        int num = lector.nextInt();
        String binari = ""; // Definim la variable del binari
        if (num>0) {
            while (num>0) { 
             if (num%2==0) { // Aquest if el ejecuta es que si el numero insertat fet el modul entre dos dona cero, s'afegeix 0
                 binari="0"+binari; }
              else {
                binari="1"+binari; // Si no surt positiu en l'operació anterior s'afegeix un 1 a String de "binari"
                }
                num=(int)num/2; }
        }
        else if (num==0) { // Si el numero es 0, es posa  0
            binari="0";
        }
        System.out.println(binari);
	 	}
}	
