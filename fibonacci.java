package myCap.one;

import java.util.Scanner;

public class fibonacci {
    static void Fib(int x) {
        int i = 0, j = 1;
        int counter = 0;

        while (counter < x) {
            System.out.print(i + " ");

            int k = i + j;
            i = j;
            j = k;
            counter += 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        Fib(x);
    }
}
