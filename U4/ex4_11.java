package EX4;

import java.util.Scanner;

public class ex4_11 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("Escriu un nombre");
	int limit =lector.nextInt();
	lector.nextLine();
	int resultat =0;
	
	for(int i=0; i<=limit ;i++) {
	if ((i%3)==0) {
	System.out.println(i);
	resultat = resultat +i;
	}
	
	}
	System.out.println("La suma de multpiles es " +resultat+ ".");
	}

}
