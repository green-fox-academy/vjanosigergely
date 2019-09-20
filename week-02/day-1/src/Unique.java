import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        System.out.println("Please give me 10 integers, with some parameters repeating!");
        Scanner scanner = new Scanner(System.in);
        int[] listOfNumbers = new int[10];

        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = scanner.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < unique(listOfNumbers).length; i++) {

            System.out.print(unique(listOfNumbers)[i] + " ");

        }
        System.out.print("]");

    }

    public static int[] unique(int[] original) {

        Arrays.sort(original);

        int counter = 0;

        for (int i = 0; i < original.length - 1; i++) {
            if (original[i] == original[i + 1]) {
                counter = counter + 1;
            }
        }
        int[] unique = new int[original.length - counter];

        int j = 1;

        unique[0] = original[0];

        for (int i = 1; i < original.length; i++) {

            if (original[i] != original[i - 1]) {
                unique[j] = original[i];
                j = j + 1;
            }

        }


        return unique;


    }
}

//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]