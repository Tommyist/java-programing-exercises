package EX6;

import java.util.Random;
import java.util.Scanner;

public class ex6_3 {
	
	Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Quantes contrasenyes vols?");
		int qty = lector.nextInt();
		lector.nextLine();
		System.out.println("Vols possar tu la logitud ?? 1-Si /2-No");
		int eleccion = lector.nextInt();
		lector.nextLine();
		int mida =8;
		if (eleccion==1)  {
			System.out.println("Quina logitud vols?");
			mida = lector.nextInt();

		}
		for (int i=0;i<qty;i++) {
			password.generarPassword(mida);
			System.out.println(password.getPassword());
			password.esRobust(mida);
		}
	}
}
