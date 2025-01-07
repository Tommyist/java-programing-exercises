package EX4;

import java.util.Scanner;

public class ex4_3 {
	public static final int  VALOR_SECRET1 =4;
	public static final int  VALOR_SECRET2=2;	
	public static void main(String[] args) {
	 Scanner lector = new Scanner (System.in);
	 System.out.println("Adivina un nombre del 1 al 10");
	 	int valornombre = lector.nextInt();
	 	lector.nextLine();
	 
	 if (valornombre<=1 || valornombre <10) {
		 if (valornombre == VALOR_SECRET1 || valornombre ==VALOR_SECRET2)
		 System.out.println("Has encertat"); 
		 else {
			 System.out.println("Has fallat"); } 
	 }
	 else if (valornombre>10) {
			System.out.println("T'has passat");  }
	}

}
