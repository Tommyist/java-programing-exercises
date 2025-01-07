package EX4;

import java.util.Scanner;

public class ex4_21 {
	// Variable global
	private static int[] llistaEnters = new int[10];
	
	public static void main(String[] args) {
		//Instruccions del mètode principal (problema general)
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		meitat();
	
	}
	//Mètode amb les instruccions per llegir la llista.
	public static void llegirLlista() {
		System.out.println("Escriu 10 valors enters i prem retorn.");
		Scanner lector = new Scanner(System.in);
		int index = 0;
		while (index < llistaEnters.length) {
			if (lector.hasNextInt()) {
					llistaEnters[index] = lector.nextInt();
					index++;
			} else {
				lector.next();
			}
		}
		lector.nextLine();
	}

	//Mètode amb les instruccions per ordenar la llista.
	public static void ordenarLlista() {
			for (int i = 0; i < llistaEnters.length - 1; i++) {
				for(int j = i + 1; j < llistaEnters.length; j++) {
			//La posició tractada té un valor més alt que el de la cerca... Els intercanviem.

					if (llistaEnters[i] > llistaEnters[j]) {
			//Per intercanviar valors cal una variable auxiliar

						int canvi = llistaEnters[i];
						llistaEnters[i] = llistaEnters[j];
						llistaEnters[j] = canvi;
					}
				}
			}
		}
	
	//Mètode amb les instruccions per mostrar la llista per pantalla.
	public static void mostrarLlista() {
		System.out.print("L'array ordenat és: [");
		for (int i = 0; i < llistaEnters.length;i++) {
			System.out.print(llistaEnters[i] +  " ");
		}
		System.out.println("]");
		}
	
	public static void meitat() {
	// En aquesta funció, es mostrara els valors inferiors de la meitat del nombre mes gran possat.
	System.out.println("Els nombres mes petits són: [");
	for (int i = 0; i < llistaEnters[9]/2;i++) {
		System.out.print(llistaEnters[i] +  " ");
	}
	System.out.println("]");
		}
	}		

	


