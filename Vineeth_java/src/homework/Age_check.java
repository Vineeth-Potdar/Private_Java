package homework;

import java.util.Scanner;

public class Age_check {
	public static void main(String[] args) {
		System.out.println("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<=10 && age>0) {
			System.out.println("Child");
		}
		if(age>10 && age<=19) {
			System.out.println("Teenager");
		}
		if(age>=20) {
			System.out.println("Adult");
		}
		if(age<=0) {
			System.out.println("Newborn / Fetus");
		}
	}
}
