import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int greaterNumber;

        System.out.println("Please give me two integers!");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        boolean isEqual = firstNumber == secondNumber;

        if (isEqual) {
            System.out.println("The two numbers are equal");
        } else if (firstNumber > secondNumber){
            greaterNumber = firstNumber;
            System.out.println(greaterNumber + " is bigger");
        } else {
            greaterNumber = secondNumber;
            System.out.println(greaterNumber + " is bigger");
        }


    }
}
// Write a program that asks for two numbers and prints the bigger one