package EX6_1;

import java.util.Scanner;

public class EX6_6 {
	
	static presoner6_6[] Convictes = new presoner6_6[100];
	static policia6_6[] Guardias  = new policia6_6[100];
	static int Presoners=0;
	static int Policias=0;
	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Programa per administrar una presó, hi haura tant els policies com els convictes.
		Els policies neceistem sebre quina categoria (Nacional,Civil...) te i desde cuant va feina
		i dels presoners necesitem sebre que van fer, quin dia van entrar i cuant acabara la seva condena
		*/
		int op=0;
		do {
			System.out.println("Tria una opció");
			System.out.println("1/ Insereix un presoner ");
			System.out.println("2/ Mostrar presoners ");
			System.out.println("3/ Insereix un policia");
			System.out.println("4/ Mostrar policies");
			System.out.println("5/ Mostrar tots");
			System.out.println("6/ Exit");
			op= lector.nextInt();
			
			if (op==1) {
				CrearPresoner();
			}
			if(op==2) {
				MostrarPresoners();
			}
			if(op==3) {
				CrearPolicias();
			}
			if(op==4) {
				MostrarPolicias();
			}
			if(op==5) {
				MostrarTots();
			}
			
			if  (op<0||op>=7);{
			System.out.println("Error");				
			}
		}
	while(op!=6);
	}
	
	public static void CrearPresoner()  {
		System.out.println(" Nom :");
		String Nom = lector.next();
		System.out.println(" Cognom :");
		String Cognom = lector.next();
		System.out.println(" Edat :");
		short Edat = lector.nextShort();
		System.out.println(" Condemnat per :");
		String delicte = lector.next();
		System.out.println(" Data que va ser introduit a la presó:");
		String DataPrincipi =lector.next();
		System.out.println(" Data per deixar la presó:");
		String DataFinal=lector.next();
		
		Convictes[Presoners]= new presoner6_6(Nom,Cognom,Edat,delicte,DataPrincipi,DataFinal);
		Presoners = Presoners+1;
	}
	
	public static void MostrarPresoners() {
		System.out.println("Llista de presoners :");
		for(int i=0;i<Presoners;i++) {
			System.out.println(Convictes[i].MostrarDadesPresoner());
		}
	}
	
	public static void CrearPolicias() {
		System.out.println(" Nom :");
		String Nom = lector.next();
		System.out.println(" Cognom :");
		String Cognom = lector.next();
		System.out.println(" Edat :");
		short Edat = lector.nextShort();
		System.out.println(" Quina categoria te :");
		String Nivell = lector.next();
		System.out.println(" Quants d'anys d'experiencia  te :");
		int Experiencia = lector.nextInt();
		
		Guardias[Policias]= new policia6_6(Nom,Cognom,Edat,Nivell,Experiencia);
		Policias = Policias+1;
		
	}
	
	public static void MostrarPolicias() {
		System.out.println("Llista de policies/guardias :");
		for(int i=0;i<Policias;i++) {
			System.out.println(Guardias[i].MostrarDadesPolicia());
		}
	}
	
	public static void MostrarTots() {
		
		System.out.println("Llista de policies/guardias :");
		for(int i=0;i<Policias;i++) {
			System.out.println(Guardias[i].MostrarDadesPolicia());
		}
		System.out.println("Llista de presoners :");
		for(int i=0;i<Presoners;i++) {
			System.out.println(Convictes[i].MostrarDadesPresoner());
		}
	}
	
}
