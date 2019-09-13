import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
       System.out.println("How tall would you like your diamond to be?");
        Scanner scanner = new Scanner(System.in);
        int diamondHeight = scanner.nextInt();

        for (int i = 0; i < ((diamondHeight - 1) / 2) ; i++) {
            for (int j = 0; j < ((diamondHeight - 1) / 2) - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2) + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        if (diamondHeight % 2 == 1) {
            for (int i = 0; i < diamondHeight ; i++) {
                System.out.print("*");
            }

        } else {
            for (int i = 0; i <diamondHeight-1 ; i++) {
                System.out.print("*");
            }
            /*System.out.println();
            for (int i = 0; i < diamondHeight-1; i++) {
                System.out.printf("*");
            }
*/
        }
        System.out.println();
        for (int i = 0; i < ((diamondHeight - 1) / 2) ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (diamondHeight/2 + 1 - 2*i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
