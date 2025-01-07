package EX4;

import java.util.Scanner;

public class ex4_18 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("introdueix el número que vols comprovar:"); 
	int num =lector.nextInt();
		if (num%2==0){
			System.out.println("El numero " +num+ " NO és un número primer");
		}
		else {
			System.out.println("El numero " +num+ " és un número primer");
		}
	}
	}
