package homework;

import java.util.Scanner;

public class Div_5_11 {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%5==0 && a%11==0) {
			System.out.println("The number "+a+" is divisible by both 5 and 11");
		}
		else if(a%5==0 && a%11!=0) {
			System.out.println("The number "+a+" is only divisible by 5");
		}
		else if(a%5!=0 && a%11==0) {
			System.out.println("The number "+a+" is only divisible by 5");
		}
		else {
			System.out.println("The number "+a+" is not divisible by both 5 and 11");
		}


	}

}
