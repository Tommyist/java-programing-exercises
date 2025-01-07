package EX4;

import java.util.Scanner;

public class ex4_23 {
	
	double resultat;
	static double euros;
	static int divisa;
	
	static double  llegirEuros() {
	Scanner lector = new Scanner(System.in);
	System.out.println("Cuants euros vols ");
	euros = lector.nextDouble();
	return euros;
	}
	
	static void LlegirMoneda() {
	
	System.out.println("A quina divisa vols cambiar ?"); 
	}
	public static int Conversor() {
		Scanner lector = new Scanner(System.in);
		System.out.println("1 Lliures"); // 1€ = 0.85 lliures
		System.out.println("2 Dolras"); //1€ = 1.16$
		System.out.println("3 Iens"); //1€ = 131.66 iens
		divisa=lector.nextInt();
		double resultat = 0;
		if (divisa ==1) {
			resultat = euros * 0.85;
			System.out.println(euros + "es igual a " +resultat+ " lliures"); }
		
		 if (divisa==2) {
				resultat = euros * 1.16;
			System.out.println(euros + "es igual a " +resultat+ " $"); }
			
		if (divisa==3) {
				resultat = euros * 131.66;
			System.out.println(euros + "es igual a " +resultat+ " iens"); }
		else {
			System.out.println("Error");
		}
		return divisa;
	
	}
	
	public static void main(String[] args) {
	llegirEuros();
	LlegirMoneda();
	int res=Conversor();
	}
	
}
	
	


