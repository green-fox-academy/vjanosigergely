import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many integers do you want to use?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int sum = 0;

        if (quantity <= 0) {
            System.out.println("Have a nice day!");
        }else {

            for (int i = 0; i < quantity; i++) {
                System.out.println("Please give me an integer");
                int n = scanner.nextInt();
                sum = sum + n;
            }

            System.out.print("Sum: " + sum + ", ");
            System.out.print("Average: " + sum / quantity);
        }
    }

}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4