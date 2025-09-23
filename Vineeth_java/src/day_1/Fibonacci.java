package day_1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int fib;
		System.out.print("Enter the number : ");	
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
	
		System.out.println("The fibonacci series is : ");
		for(int i=2;i<=n;i++) {
			fib=n1+n2;
			n1=n2;
			n2=fib;
			System.out.print(fib+" ");
		}
	}
}
