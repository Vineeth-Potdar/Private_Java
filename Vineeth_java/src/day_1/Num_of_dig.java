package day_1;

import java.util.Scanner;

public class Num_of_dig {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();//As this is int, it can only take up to 9 digits
		System.out.print("Enter the long number : ");
		long t = sc.nextLong();// This can only take upto 19 digits
		System.out.print("Enter the extra long number : ");
		String s = sc.next();//This can take n number of digits
		int c = 0;
		int n = 0;
		while(num > 0)
		{
			num = num / 10;
			c= c+1;
		}
		while(t > 0)
		{
			t = t / 10;
			n= n+1;
		}
		int l = s.length();
		System.out.println("The number of digits are : " + c);
		System.out.println("The number of digits for long number is : " + n);
		System.out.println("The number of digits for extra long number is : " + l);
	}
}

