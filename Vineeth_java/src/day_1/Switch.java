package day_1;

import java.util.Scanner;

public class Switch {
	 public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print(" enter the value of a :");
		int a = sc.nextInt();
		System.out.print(" enter the value of b :");
		int b = sc.nextInt();
		System.out.print(" enter operator:");
		char op= sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println("Sum= "+(a+b));
			break;
		case '-':
			System.out.println("Difference= "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication= "+(a*b));
			break;
		case '/':
			System.out.println("Division= "+(a/b));
			break;
		case '%':
			System.out.println("Modulus= "+(a%b));
			break;
		}
	}
}