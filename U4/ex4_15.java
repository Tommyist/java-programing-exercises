package EX4;

import java.util.Scanner;

public class ex4_15 {

	public static void main(String[] args) {
	    Scanner lector = new Scanner(System.in); //demanar quin nombre de files vol
        System.out.print("De quantes files vols la piramide?");
        int numFilas = lector.nextInt();
        lector.nextLine();
 
        System.out.println(); 
        for(int alçada = 1; alçada<=numFilas; alçada++){
        	// L'alçada va relacionat amb el nombre de files 
        	
        for(int espais = 1; espais<=numFilas-alçada; espais++){ 
                System.out.print(" ");
               // Per fer els espais tenim que tenir el nombre de files i 
            }
        for(int estrelles=1; estrelles<=(alçada*2)-1; estrelles++){ 
                System.out.print("*");
           //Cada vegada que es pasa a una nova fila, s'en afegeixen dos estrelles a les bandes
    
            }
            System.out.println();
        }
    }
	}


