package day_2;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;

        if (a <= 1) {
            System.out.println("Enter a positive integer");
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                c = c + 1;
            }
        }

        if (c == 0) {
            System.out.println("It is Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
}
