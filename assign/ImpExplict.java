//Write a program that demonstrates implicit and explicit type casting.

package assign;

public class ImpExplict {
    public static void main(String[] args) {
        //Implict Typecasting
        int num=100;
        double num1=num;
        System.out.println(num1);

        //ExplictTypecasting
        double number=234.876;
        int number1=(int) number;
        System.out.println(number1);
    }
   
}
