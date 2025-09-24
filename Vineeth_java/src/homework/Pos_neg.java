package homework;

import java.util.Scanner;

public class Pos_neg {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=0) {
			System.out.println(a+" is positive number");
		}
		else {
			System.out.println(a+" is negative number");
		}

	}

}
