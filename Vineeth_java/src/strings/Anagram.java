package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = sc.next().trim().toLowerCase();
		System.out.print("Enter the second string : ");
		String str2 = sc.next().trim().toLowerCase();
		if (str1.length() !=str2.length())
			System.out.println("Not anagram");
		else
		{
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1,arr2))
			{
				System.out.println("The strings are Anagram");
			}
			else
			{
				System.out.println("The strings are not Anagram");
			}
		}
	}
}