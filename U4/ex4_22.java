package EX4;

import java.util.Scanner;

public class ex4_22 {
	
	public static boolean esPrimo() {
		Scanner lector = new Scanner(System.in);
		int val = 0, num = 1, i = 0, a = 0, aa = 0;
		System.out.println("Quants numerus primers vols?");
		val = lector.nextInt();
		lector.nextLine();
		while(val > aa) {
			a = 0;
			for (i = num / 2; i >= 2; i--) {
			if (num % i == 0) {
			a++;
				}	
			}
			if(a > 0) {
				num++;
			}else {
				System.out.println(num);
				num++;
				aa++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		esPrimo();
		}
	}


