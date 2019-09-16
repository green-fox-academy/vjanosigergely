import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Please give me an integer!");
        Scanner scanner = new Scanner(System.in);
        int givenParameter = scanner.nextInt();

        System.out.println(sum(givenParameter));

    }
    public static int sum (int incomingNumber) {
        int sum = 0;
        for (int i = 0; i <= incomingNumber ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter