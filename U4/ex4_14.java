package EX4;

import java.util.Scanner;

public class ex4_14 {

	public static void main(String[] args) {
		  Scanner lector = new Scanner(System.in);
		    int i,j;
		    System.out.print("Posa un numero de files");
		    int files = lector.nextInt();
		    lector.nextLine();
		   
		    for (i = 0; i < files; i++){
		       for(j = 0; j < files; j++){
		         if(j <= i){
		           System.out.print("a"); 
		         }
		         if(j == i){
		           System.out.println(""); 
		         }
		       }
		    }

		  }  
		}


