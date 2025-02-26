package assign;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("Positive ");

        } else if (num < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");

        }
        sc.close();
    }
}
