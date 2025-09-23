package day_1;

import java.util.Scanner;

public class Largest_num {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a>=b && a>=c) {
		System.out.println("the largest numbert is a");
	}
	if(b>=a && b>=c) {
		System.out.println("thelargest number is b");
	}
	else {
		System.out.println("thelargest number is c");
	}
}
}