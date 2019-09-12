import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Please give me an integer!");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();

        if (n<=0) {
            System.out.print("Not enough");
        }
        else if (n==1) {
            System.out.println("One");
        }
        else if (n==2) {
            System.out.println("Two");
        }
        else {
            System.out.println("A lot");
        }
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
    }
}
