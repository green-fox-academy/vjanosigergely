import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Give me an integer!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 0; i < n-2 ; i++) {
            System.out.print("%");
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            for (int k = 0; k < (n-3) - i ; k++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }


        for (int i = 0; i < n; i++) {
            System.out.print("%");
        }



        //}
    }
}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was