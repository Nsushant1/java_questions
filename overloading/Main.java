package overloading;

class Operation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        Operation op = new Operation();

        System.out.println(op.add(88, 44));
        System.out.println(op.add(2, 4, 5));
        System.out.println(op.add(44.44, 66.66));
        System.out.println(op.add("Hello", "Sushant"));
    }

}
