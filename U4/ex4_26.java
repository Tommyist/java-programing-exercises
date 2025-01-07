package EX4;

import java.util.Scanner;

public class ex4_26 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu una frase");
		String frase = lector.nextLine();
		int contador=1;
		
		for (int i=0;i<frase.length();i++) {
			if(frase.charAt(i)== ' ' ||frase.charAt(i)== '\n' ) {
				contador++;
			}
		}
		String paraules = frase.toLowerCase();
		int[] contvocals = new int [contador];
		contador=0;
		for (int j=0;j<paraules.length();j++) {
			if(paraules.charAt(j)== 'a' ||paraules.charAt(j)== 'e' ||paraules.charAt(j)== 'i' ||paraules.charAt(j)== 'o' ||paraules.charAt(j)== 'u') {
				contvocals[contador]++;
			}
			else if (paraules.charAt(j)==' ') {
				contador++;
			}
		}
		int MesVocals = contvocals[0];
		int poss =0;
		for (int x=0;x<contvocals.length;x++) {
			if(contvocals[x]>MesVocals) {
				poss=x;
				MesVocals = contvocals[x];
			}
		}
		poss++;
		System.out.println("La paraula la que mes vocals te es: " +poss+ " que te " +MesVocals+ " .");
			
		}
	}
