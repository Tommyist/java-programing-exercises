package EX4;

import java.util.Scanner;

public class ex4_19 {

	public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			int primers = 0, num = 1, divisors = 0, cont = 0;
			System.out.println("Escriu el nombre de numerus primers que vulguis");
			primers = lector.nextInt();
			lector.nextLine();
			while(primers > cont) {
				divisors = 0;
				for (int i = num / 2; i >= 2; i--) {
					if (num % i == 0) {
					divisors++;
					}
				}
				if(divisors > 0) {
					num++;
				}else {
					System.out.println(num);
					num++;
					cont++;
				}
			}
		}
	}
