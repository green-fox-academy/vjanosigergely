import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please provide 5 integers in 5 lines!");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5 ; i++) {
            int n = scanner.nextInt();
            sum = sum + n;
        }

        System.out.println(sum);
        System.out.println(sum/5);
    }

}


// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4