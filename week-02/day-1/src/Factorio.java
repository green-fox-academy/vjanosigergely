import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        System.out.println("Please give me an integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The factorial of this number is " + factorio(number));
    }

    public static int factorio (int inputNumber) {
        int factorial = 1;

        for (int i = 1; i <= inputNumber ; i++) {
            factorial = i * factorial;
        }

        return factorial;
    }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial