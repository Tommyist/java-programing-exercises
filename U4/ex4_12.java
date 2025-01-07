package EX4;

import java.util.Scanner;

public class ex4_12 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("Escriu un nombre");
	int n1= lector.nextInt();
	lector.nextLine();
	int n2= lector.nextInt();
	lector.nextLine();
	
	if (n1>n2) {
		System.out.println("error"); }
	else {
	  while	(n1<n2) {
	  System.out.println(n1);
	  n1++;
	  }	
	}
	System.out.println("Aquest serian els numeros entre el numero 1 i numero 2");
	}

}
