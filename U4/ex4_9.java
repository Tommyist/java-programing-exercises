package EX4;

import java.util.Scanner;

public class ex4_9 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);	
	System.out.println("Quin es el divident");	
	int divident = lector.nextInt();
	lector.nextLine();
	System.out.println("Quin es el divisor");
	int divisor = lector.nextInt();
	lector.nextLine();
	
	if (divident>=divisor) {
	divident = divident -divisor;
	System.out.println("El resultat del modul es " +divident+ ".");
	}				
	

}
}
