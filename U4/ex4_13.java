package EX4;

import java.util.Scanner;

public class ex4_13 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Posa un divisor");
		boolean semafor = false;
		int valorUsuari=lector.nextInt();
		lector.nextLine();
		int div;
		for (int i=2;i<valorUsuari;i++) {
			if ((valorUsuari%i)==0) {
			div=i;
			System.out.println(div);
			}
			else  {
				semafor=true;
				System.out.println("Error");}
		}
		
	}

}
