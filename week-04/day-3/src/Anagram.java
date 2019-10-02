import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.anagramFinder("mamamama", "mamamama");
    }

    public boolean anagramFinder (String first, String second){
        boolean isAnagram;

        if (first.length() != second.length()) {
            isAnagram = false;
        } else {
            ArrayList<Character> firstArray = new ArrayList<>();
            ArrayList<Character> secondArray = new ArrayList<>();

            for (int i = 0; i < first.length(); i++) {
                firstArray.add(first.charAt(i));
            }
            for (int i = 0; i < second.length(); i++) {
                secondArray.add(second.charAt(i));
            }

            Collections.sort(firstArray);
            Collections.sort(secondArray);


            int counter = 0;

            for (int i = 0; i < firstArray.size(); i++) {
                if(firstArray.get(i) == secondArray.get(i)){
                        counter +=1;
                }
            }
            if (counter == firstArray.size()) {
                isAnagram = true;
            } else {
                isAnagram = false;
            };
        }


        return isAnagram;
    }
}

// Anagram
//Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//Create a test for that.