import java.util.Scanner;

public class SubInt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want your array to be?");
        int a = scanner.nextInt();

        System.out.println("What number are you looking for?");
        String numberSearched = scanner.next();

        System.out.println("Please input the" + a +  "integers you want to use in your array");
        String[] searchingField = new String[a];

        for (int i = 0; i < searchingField.length; i++) {
            searchingField[i] = scanner.next();
        }
        int[] comeBackArray = numberSearcher(numberSearched, searchingField) ;

        System.out.print("[");
        for (int i = 0; i < comeBackArray.length ; i++) {
            System.out.print(comeBackArray[i] + " ");
        }
        System.out.println("]");

    }

    public static int[] numberSearcher(String numberSearched, String[] searchingField) {
        int reverseArray [] = new int [searchingField.length];
        for (int i = 0; i <searchingField.length ; i++) {
            reverseArray[i] = -1;
        }
        for (int i = 0; i < searchingField.length ; i++) {

            for (int j = 0; j < searchingField.length; j++) {
                for (int k = 0; k < searchingField[j].length(); k++) {
                    if (searchingField[j].charAt(k) == numberSearched.charAt(0)) {
                        if (reverseArray[i] == -1) {
                            reverseArray[i] = j;
                            break;}
                    }/*else{
                        reverseArray[i+j+k+1] = -1;
                    }*/
                }
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