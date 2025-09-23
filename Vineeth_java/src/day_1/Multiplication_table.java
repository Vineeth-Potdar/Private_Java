package day_1;

import java.util.Scanner;

public class Multiplication_table {
		public static void main(String[] args) {
			System.out.print("Enter the number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("Table in descending order : ");
			for (int i=10; i>=1; i--) {
				System.out.println(num+ " x " +i+"=" + (num * i));
			}
			System.out.println("Table in ascending order : ");
			for (int i=1; i<=10; i++) {
				System.out.println(num+ " x " +i+"=" + (num * i));
			}
		} 
	}