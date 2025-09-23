package day_1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.print("Enter the word : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toLowerCase();
        String t = "";
        int l = a.length();

        for (int i = l - 1; i >= 0; i--) {
            t = t + a.charAt(i);
        }

        System.out.println("The reversed word is : " + t);

        if (a.equals(t)) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("The word is not a Palindrome");
        }
    }
}

