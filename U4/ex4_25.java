package EX4;

import java.util.Scanner;

public class ex4_25 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);		
	String frase = lector.nextLine();
	System.out.println("Escriu un texte");
	char[] paraules = new char[frase.length()];
	char cont = ' ';
	char mesrepetida = ' ';
	int rep =0;
	int vegades = 0;
	
	for (int i=0;i<frase.length();i++) {
	 paraules[i] = frase.charAt(i);
	}
	
	for (int i=0;i<frase.length();i++) {
	  cont =paraules[i];
	  
	  for (int j=0;j<frase.length();j++) {
		 if (cont == paraules[j]) {
		 rep++;
	  }
	  if (rep >1) {
		 vegades = rep;
		 mesrepetida = paraules[i];
	  }
	}
	  rep=0;
	}
	System.out.println("S'ha lletra que mes es repeteix es " +mesrepetida);
	System.out.println("Es repeteix "+ vegades);
	}
}

	
	

