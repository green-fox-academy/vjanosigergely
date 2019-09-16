import java.util.Scanner;

public class CountFromToJava {
    public static void main(String[] args) {
        System.out.println("Please give me an integer!");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        System.out.println("Please give me a bigger integer!");
        int m = scanner.nextInt();


        if (m <= n) {
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = n; i <m+1 ; i++) {
                System.out.println(i);
            }
        }
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
    }
}
