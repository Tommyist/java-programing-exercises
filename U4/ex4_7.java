package EX4;

import java.util.Scanner;

public class ex4_7 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("Insereix un caracter");	
	int valor=lector.nextInt();
	int i=0;
	
	while (i<valor) {
	System.out.println("-");
	i++;
	}
	System.out.println("S'ha acabat");
	}

}
