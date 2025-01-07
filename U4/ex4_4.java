package EX4;

import java.util.Scanner;

public class ex4_4 {
	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		 System.out.println("Insereix tres nombres");
	
	int valor1 =lector.nextInt(); 
	int valor2 =lector.nextInt(); 	 
	int valor3 =lector.nextInt(); 	 
	
	if (valor1>valor2)
	  if (valor1>valor3)
		  System.out.println(valor1);
	
	if (valor2>valor1)
	  if (valor2>valor3)
		  System.out.println(valor2);
	
	if (valor3>valor1)
	  if (valor3>valor2)
		  System.out.println(valor3);
	
	}
}
