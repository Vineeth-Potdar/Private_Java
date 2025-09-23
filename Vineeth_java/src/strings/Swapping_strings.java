package strings;

import java.util.Scanner;

public class Swapping_strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string s1 : ");
		String s1 = sc.next();
		System.out.print("Enter string s2 : ");
		String s2 = sc.next();
		s1 = s1 + s2;
		s2 = s1.substring(0,s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(" ");
		System.out.println("After swapping");
		System.out.println(" ");
		System.out.println("The string s1 : " +s1);
		System.out.println("The string s2 : " +s2);
	}
}
 
