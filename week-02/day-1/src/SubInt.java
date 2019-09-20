import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want your array to be?");
        int a = scanner.nextInt();

        System.out.println("What number are you looking for?");
        int numberSearched = scanner.nextInt();

        System.out.println("Please input the" + a + "integers you want to use in your array");
        int[] searchingField = new int[a];

        for (int i = 0; i < searchingField.length; i++) {
            searchingField[i] = scanner.nextInt();
        }
        String[] comeBackArray = numberSearcher(numberSearched, searchingField);


        //Printing the resulting Array:
        System.out.print("[");
        for (int i = 0; i < comeBackArray.length; i++) {

            if (i < comeBackArray.length - 1) {
                System.out.print(comeBackArray[i] + ",");
            } else {
                System.out.print(comeBackArray[i]);
            }
        }
        System.out.println("]");

    }

    public static String[] numberSearcher(int number, int[] Field) {

        String numberSearched = String.valueOf(number);
        String [] searchingField = new String[Field.length];

        for (int i = 0; i < Field.length ; i++) {
            searchingField[i] = String.valueOf(Field[i]);
        }

        //defining new Array's length
        int arrayLengthCounter = 0;

        for (int i = 0; i < searchingField.length; i++) {
            if (searchingField[i].contains(numberSearched)) {
                arrayLengthCounter = arrayLengthCounter + 1;
            }

        }

        //Creating empty reverse array:
        String reverseArray[] = new String[arrayLengthCounter];


        //filling reverse array with proper elements:
        int j = 0;

        for (int i = 0; i < searchingField.length; i++) {

            if (searchingField[i].contains(numberSearched)) {
                reverseArray[j] = searchingField[i];
                j = j + 1;
            }

        }
        return reverseArray;
    }


}
//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

//  Example:
// System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
//   System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'