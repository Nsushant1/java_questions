package assign;

public class Factorial {
    static int factorial(int n) {
        if (n == 0) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 6;
        int result = factorial(num);
        System.out.println("Factorial:" + result);

    }
}
