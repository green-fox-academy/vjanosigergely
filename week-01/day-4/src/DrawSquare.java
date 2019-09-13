import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("How tall do you want your square to be?");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 0; i < height -2 ; i++) {
            System.out.print("%");

            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("%");
            System.out.println();
            
        }

        for (int i = 0; i < height ; i++) {
            System.out.print("%");
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was