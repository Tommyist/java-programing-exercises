package EX4;

import java.util.Scanner;

public class ex4_10 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("Digues un mes");
	int i=lector.nextInt();
	lector.nextLine();
	
	if(i>=1 && i<13) {
	  if(i==2)
		  System.out.println("El mes te 28/29 dies");  
	  else if(i==4 || i==6 || i==9 || i==11)
		  System.out.println("El mes te 30 dies");  
	  else {
		  System.out.println("El mes te 30 dies");}  
	  
	}
	else {
		System.out.println("Nombre incorrecte");
	}
	
		
	}

}
