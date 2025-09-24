package homework;

import java.util.Scanner;

public class Voter {
	public static void main(String[] args) {
		System.out.print("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		System.out.print("Enter the name : ");
		String name = sc.next();
		if(age>=18 && age<100) {
			System.out.println(name+" is eligible to vote.");
		}
		else {
			System.out.println(name+" is not eligible to vote");
		}
	}
}
