import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("How many rows do you want in your pyramid?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= ( 2*i -1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was