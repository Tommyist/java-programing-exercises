package EX6;

import java.util.Scanner;

public class ex6_2 {
	static CompteBancari[] comptes  = new CompteBancari[100];
		static int ComptesCreats=0;
		static Scanner lector = new Scanner(System.in);

public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		crearCompte();
		int opcion=0;
		do {
		System.out.println("Que vols fer ?");
		System.out.println("1/ Ingresar diners");
		System.out.println("2/ Retirar diners");
		System.out.println("3/ Mostrar saldo");
		System.out.println("4/ Exit");
		opcion = lector.nextInt();
		
		if (opcion ==1) {
			ingressarDoblers();
			}
		else if (opcion==2) {
			RetirarDoblers();
		}
		else if(opcion==3) {
			mostrarsaldo();
				}
		}
		while (opcion !=4);
	}
public static void crearCompte() {
		//Leer valores inicales de la cuenta dniTitular, saldo, nomTitualr
		//Generar objeto y guardarlo en la position indicada 
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe tus datos");
		System.out.println("DNI");
		String dniTitular = lector.nextLine();
		System.out.println("Nom");
		String nomTitular = lector.nextLine();
		int saldo=0;
		System.out.println("El teu sou es : " +saldo);
		comptes[ComptesCreats] = new CompteBancari (dniTitular, nomTitular, saldo);
		ComptesCreats++; 
	}
public static void ingressarDoblers() {
		//Cuenta que quiere incrementar
		//Pedir dniTituar
		//Cantidad a ingresar	
		System.out.println("El teu DNI es?");
		String dniTitular = lector.next();
		for (int i=0;i<ComptesCreats;i++) {
		if (dniTitular.equals(comptes[i].getDniTitular())) {
		System.out.println("Quina cuantiat vols ingressar?");
		double quantitat = lector.nextDouble();
		comptes[i].ingresar(quantitat);
		comptes[i].MostrarSaldo();
					}
			}
		}
public static void RetirarDoblers() {
		//Cuenta que quiere incrementar
		//Pedir dniTituar
		//Cantidad a ingresar	
		System.out.println("El teu DNI es?");
		String dniTitular = lector.next();
		for (int i=0;i<ComptesCreats;i++) {
		if (dniTitular.equals(comptes[i].getDniTitular())) {
		System.out.println("Quina cuantiat vols treure?");
		double quantitat = lector.nextDouble();
		comptes[i].reintegrar(quantitat);
		comptes[i].MostrarSaldo();
					}
			}
		}
public static void mostrarsaldo() {
		 System.out.println("El teu DNI es?");
		 String dniTitular = lector.next();
		 for (int i=0;i<ComptesCreats;i++) {
		if (dniTitular.equals(comptes[i].getDniTitular())) {
				}
		comptes[i].MostrarSaldo();
			}
		}
}
		
	

	


