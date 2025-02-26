package assign;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();

        int result = (num > 0) ? 1 : (num < 0) ? -1 : 0;
        switch (result) {
            case 1:
                System.out.println("Positive");

                break;
            case -1:
                System.out.println("Negative");
                break;

            default:
                System.out.println("Zero");
                break;
        }

        sc.close();
    }

}
