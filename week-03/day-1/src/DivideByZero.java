import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        System.out.println("Please give me a number to divide 10 with: ");
        int divisor = scanner.nextInt();
        int result;

        try {
            result = a/divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }

}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0