import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please give me an integer!");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();

        boolean isItEven = n % 2 == 0;

        if (isItEven == true) {
                    System.out.println("Your number is Even");
        }
        else {
            System.out.println("Your number is Odd");
        }
    }

    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
}
