import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        int maxBC = Math.max(b , c);

        if ( a > maxBC){
            return a;
        } else {
            return maxBC;
        }
    }

    int median(List<Integer> pool) {
        if (pool.size() % 2 == 1){
            return pool.get((pool.size()-1)/2);
        } else {
            int half = pool.size()/2;

            return pool.get(half+1);
        }


    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'U', 'O', 'E','I',
                'á','Á','é','É', 'Í', 'í', 'ó', 'Ó', 'ö', 'Ő', 'Ö', 'ő', 'ú', 'Ú', 'Ü', 'ü', 'ű', 'Ű').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        String modified = "";
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c) == false){
                modified = modified + teve.charAt(i);
            } else
            if (isVowel(c)) {
                modified = modified + teve.charAt(i) + 'v' + teve.charAt(i);
            }
        }

        return modified;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed