package EX4;

import java.util.Scanner;

public class ex4_27 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu un nombre");
		int i=lector.nextInt();
		System.out.println("Escriu un altre nombre");
		int j=lector.nextInt();
		
		  int[][] matriu = new int [i][j];
		  for(int x=0; x<matriu.length; x++) {
			   for(int y=0; y<matriu.length; y++) {
			    matriu [y] [y] = 1;
			    System.out.print(matriu [x] [y]);
			   }
			   System.out.println("");
			  }
			}
	}
