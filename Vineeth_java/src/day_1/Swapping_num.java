package day_1;

import java.util.Scanner;

public class Swapping_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter value of b : ");
		int b = sc.nextInt();
		int temp;
		System.out.println( "after swapping");
		System.out.println( "   ");
		temp = b;
		b = a;
		a = temp;
		System.out.println("the value of a is " +a);
		System.out.println("the value of b is " +b);
	}
}
