package EX4;

import java.util.Scanner;

public class ex4_20 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Quants diners vols (ha de ser multiple de 5)");
		int euros=lector.nextInt();
		int n500= 0, n400=0,n200=0,n100=0,n50=0,n20=0,n10=0,n5=0;
		
		if (euros>=500) {
		n500 =+euros/500;
		}
			if (euros>=200) {
				n200=(euros%500)/200;}
				if (euros>=100) 
					n100 =((euros%500)%200)/100;
					if (euros>=50) {
						n50 =(((euros%500)%200)%100)/50;
						}
							if (euros>=20) {
								n20 =((((euros%500)%200)%100)%50)/20;
								}
								if (euros>=10) {
									n10 =(((((euros%500)%200)%100)%50)%20)/10;
									}
									if (euros>=5) {
										n5 =((((((euros%500)%200)%100)%50)%20)%10)/5;
										}
	
			System.out.println(n500+ " Numero de billets de 500");
			System.out.println(n200+ " Numero de billets de 200");
			System.out.println(n100+ " Numero de billets de 100");
			System.out.println(n50+ " Numero de billets de 50");
			System.out.println(n20+ " Numero de billets de 20");
			System.out.println(n10+ " Numero de billets de 10");
			System.out.println(n5+ " Numero de billets de 5");

			}
	}



	

