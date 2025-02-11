package Lab1;

import java.util.Scanner;

public class Averege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
            sum = sum + sc.nextInt();
        }
        float averege = sum / 5;
        System.out.println("The average is " + averege);

        sc.close();

    }
}
