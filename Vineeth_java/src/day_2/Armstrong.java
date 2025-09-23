package day_2;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int org = n;
		int arm = 0;

		while (n > 0)
		{
			int digit = n % 10;
			arm = arm + (digit * digit * digit);
			n = n / 10;
		}
		if (arm == org)
		{
			System.out.println(org+" is an Armstrong number");
		}
		else
		{
			System.out.println(org+ " not an Armstrong number");
		}
	}
}