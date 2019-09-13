import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess what integer I am thinking about?");
        Scanner scanner = new Scanner(System.in);
        int solution = 8;
        int guessed = scanner.nextInt();
        boolean wrongnumber = guessed != solution;

       /* if (guessed == solution) {
            System.out.println("You found the number " + solution);
        }*/

        while (wrongnumber) {
            if (guessed > solution) {
                System.out.println("The stored number is lower");
                guessed = scanner.nextInt();
            }

            /*else if (guessed == solution) {
                System.out.println("You found the number " + solution);
            }*/

            else if (guessed < solution) {
                System.out.println("The stored number is higher");
                guessed = scanner.nextInt();
            }
            else {
                break;
            }
        }
        System.out.println("You found the number " + solution);

      /*  else if(guessed > solution) {
            System.out.println("The stored number is lower");
            guessed = scanner.nextInt();
        }
        else {
            System.out.println("The stored number is higher");
           guessed = scanner.nextInt();
        }*/
    }
}
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8