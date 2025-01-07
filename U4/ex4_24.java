package EX4; 

import java.util.Scanner;

public class ex4_24 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);	
	System.out.println("Posa un nombre de 15 cifres");	
	int []numCa = new int[15];
	int major=0;
	int menor=0;
	int possM=0;
	int possmn=0;
	
	for (int i=0; i<numCa.length;i++) {
		numCa[i] = lector.nextInt(); 
	
	for (int j=0; j<numCa.length;j++) {	
		if (numCa[j]>major) {
			major = numCa[j];	
			possM=j;
		}
		
	for (int m=0; m<numCa.length;m++) {
		if (numCa[m] < menor) {
			menor = numCa[m];	
			possmn = m;	
				}
			}
		}
	}
	System.out.println("El numero mes gran es : "+major);
	System.out.println("La possició es :" +possM);
	System.out.println("El numero mes petit es : "+menor);
	System.out.println("La possició es :" +possmn);
		}
}

