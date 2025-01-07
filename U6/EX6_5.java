package EX6_1;

import java.util.Scanner;

public class EX6_5 {

	static palumne[] Alumnat = new palumne[100];
	static profe[] Professorat  = new profe[100];
	static int Alumnes=0;
	static int Profesors=0;
	static int op=0;
	
	
	public static void main(String[] args) {
		do {
		System.out.println("Que vols fer ?");
		System.out.println("1/Crear Alumne");
		System.out.println("2/Mostrar Alumnes");
		System.out.println("3/Crear Professor");
		System.out.println("4/Mostrar Professors");
		System.out.println("5/Mostrar tots");
		System.out.println("6/Exit");
		Scanner lector = new Scanner(System.in);
		op = lector. nextInt();
		
		if(op==1) {
			CrearAlumne();
		}
		if(op==2) {
			MostrarAlumne();
		}
		if(op==3) {
			CrearProfessor();
		}
		if(op==4) {
			MostrarProfessor();
			}
		if(op==5) {
			MostrarTots();
		}
		if (op<0 || op>7) {
			System.out.println("Error");
		}
		} 
		while (op!=6) ;
		System.out.println("Programa finalitzat");
	}
	public static void CrearAlumne() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Nom del Alumne");
		String Nom= lector.next();
		System.out.println("DNI");
		String DNI= lector.next();
		System.out.println("Cuant d'anys te?");
		Short Edad= lector.nextShort();
		System.out.println("Que cursa?");
		String Nivell=lector.next();
		
		Alumnat[Alumnes]= new palumne(Nom,DNI,Edad,Nivell);
		Alumnes=Alumnes+1;
		
	}
	public static void MostrarAlumne() {
	for (int i=0;i<Alumnes;i++) {
		System.out.println(Alumnat[i].MostrarDadesAlumne());
	}
		}
	public static void CrearProfessor() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Nom del Professor");
		String Nom= lector.next();
		System.out.println("DNI");
		String DNI= lector.next();
		System.out.println("Cuant d'anys te?");
		Short Edad= lector.nextShort();
		System.out.println("De quina asignatura es professor?");
		String asignatura= lector.next();
		
		Professorat[Profesors]= new profe(Nom,DNI,Edad,asignatura);
		Profesors=Profesors+1;
		
	}
	public static void MostrarProfessor() {
		for (int i=0;i<Profesors;i++) {
			System.out.println(Professorat[i].MostrarDadesProfe());
		}
	}
	public static void MostrarTots() {
		System.out.println("Llista d'alumnes");
		for (int i=0;i<Alumnes;i++) {
			System.out.println(Alumnat[i].MostrarDadesAlumne());
		}
		System.out.println("Llista de professors");
		for (int i=0;i<Profesors;i++) {
			System.out.println(Professorat[i].MostrarDadesProfe());
		}
	}
	
}
