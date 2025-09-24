package homework;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		System.out.println("Enter the letter : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] vo = {"a","e","i","o","u"};
		int c=0;
		for(int i=0;i<=vo.length-1;i++) {
		if(a.equals(vo[i])) {
			System.out.println("The letter is a vowel");
			c++;
			}
		}
		if(c == 0) {
		System.out.println("The letter is a consonant");
		}
	}
}
