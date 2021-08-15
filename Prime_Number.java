package myCap.one;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert any number: ");
        int a = sc.nextInt();
        boolean block = false;

        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
               block = true;
               break;
            }
        }
        if (!block) {
            System.out.println(a + " is a prime number.");
        }else
            System.out.println(a + " is not a prime number.");

        System.out.println("Code submitted by Priyanshu Naudiyal");
    }
}
