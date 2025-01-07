package EX4;

import java.util.Scanner;

public class ex4_5 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	
	System.out.println("Introdueix un nombre");
	num1 =lector.nextInt();
	lector.nextLine();
	System.out.println("Introdueix un altre nombre");
	num2 =lector.nextInt();
	lector.nextLine();	
	System.out.println("Introdueix un darrer nombre");
	num3 =lector.nextInt();
	lector.nextLine();
	
	if (num1>num2 && num2>num3) {
		System.out.println(num1+ ", " +num2+ " i " +num3); }
	if (num1>num3 && num2>num3) {
		System.out.println(num1+ ", " +num3+ " i " +num3);	}
	else if (num2>num1 && num1>num3) {
	System.out.println(num2+ ", " +num1+ " i " +num3); }
	else if (num2>num3 && num3>num1) {
		System.out.println(num2+ ", " +num3+ " i " +num1); }	
	else if (num3>num1 && num1>num2) {
		System.out.println(num3+ ", " +num1+ " i " +num2); }	
	else if (num3>num2 && num2>num1) {
		System.out.println(num2+ ", " +num3+ " i " +num1); }	
	}
	
	
	}


