package day_1;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		System.out.print("Factorial series of the number is : ");
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			System.out.print(fact+"  ");
			
		}
		System.out.println(" ");
		System.out.println("Factorial of the number is : "+fact);

	}

}
