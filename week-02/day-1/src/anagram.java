import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();


        char[] firstWord = word1.toCharArray();
        char[] secondWord = word2.toCharArray();

        System.out.println(anagramFinder(firstWord,secondWord));


    }

    public static boolean anagramFinder(char[] wordArray1, char[] wordArray2) {
        Arrays.sort(wordArray1);
        Arrays.sort(wordArray2);
        boolean isAnagram;

        if (wordArray1.length != wordArray2.length) {
            isAnagram = false;
        } else {
            int truthCounter = 0;
            for (int i = 0; i < wordArray1.length; i++) {
                if (wordArray1[i] == wordArray2[i]) {
                    truthCounter = truthCounter + 1;
                }

            }
            if (truthCounter == wordArray1.length) {
                isAnagram = true;

            }else{
                isAnagram = false;
            }
        }

        return isAnagram;

        }



}
