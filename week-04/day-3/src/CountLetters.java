import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountLetters {

    public static void main(String[] args) {
        CountLetters countLetters = new CountLetters();

        countLetters.occuranceFinder("madam");
    }

    public HashMap<Character,Integer> occuranceFinder(String word){
        HashMap<Character, Integer> occurance = new HashMap<>();
        List<Character> arranged = new ArrayList<Character>();
        for (int i = 0; i < word.length() ; i++) {
            arranged.add(word.charAt(i));
        }
        Collections.sort(arranged);
        int counterOne = 0;

        for (int i = 0; i < arranged.size() ; i += counterOne) {
            int counterTwo = 1;
            for (int j = i; j < arranged.size()-1; j++) {
                if (arranged.get(j) == arranged.get(j+1)){
                    counterTwo += 1;
                }
            }
            counterOne = counterTwo;
            occurance.put(arranged.get(i), counterTwo);
        }

        return  occurance;
    }
}

//Count Letters
//Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.
//Create a test for that.