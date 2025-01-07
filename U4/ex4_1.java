package EX4;

import java.util.Scanner;

public class ex4_1 {
	public static final float SUMA =2;
	public static final float PREUMINIM =30;	
	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
		System.out.println("Quin es el preu del producte?");
		float preu=lector.nextFloat();
		lector.nextLine();
		
	if (preu<PREUMINIM) {
	float Suplement= preu + SUMA;
	preu=preu+SUMA;
	System.out.println("Se t'ha afegit dos euros per lo que et costara " +preu+ "€"); }
	else {
		System.out.println("El preu es " +preu+ "€");
	}
	
	} 
	
}
