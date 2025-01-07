package EX4;

import java.util.Scanner;

public class ex4_6 {
	public static final float PREUMINIM =100;	
	public static void main(String[] args) {
	 Scanner lector=new Scanner(System.in);
	 System.out.println("Quin es el preu del producte?");
	 int PreuCorrecte = lector.nextInt();
	 if (PreuCorrecte >=PREUMINIM) {
	 System.out.println("El preu es exacte"); 
	 }
	 else {}
	 System.out.println("El preu no es exacte");
	}

}
