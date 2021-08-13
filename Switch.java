package myCap.one;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        int option;
        System.out.print("Lock one: ");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Yo-yo");
                break;
            case 2:
                System.out.println("Gracias");
                break;
            case 3:
                System.out.println("Halo");
                break;
            default:
                System.out.println("Invalid action");
        }
    }
}
