package EX4;

import java.util.Scanner;

public class ex4_2 {
	public static final int  VALOR_SECRET1 =4;
	public static final int  VALOR_SECRET2=2;	
	
	public static void main(String[] args) {
	 Scanner lector=new Scanner(System.in);
	 System.out.println("Juguem a un joc");
	 System.out.println("Tenc dos nombres secrets, avam si els endivines");
int valornombre=lector.nextInt();
lector.nextLine();

if (valornombre == VALOR_SECRET1 || valornombre == VALOR_SECRET2) {
System.out.println("Has has endevinat");	
	
}
else {}
	System.out.println("Has fallat :c");
 }
}