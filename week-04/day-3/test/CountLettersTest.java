import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters = new CountLetters();

    @Test
    public void occuranceFinder() {
        String searchable = "amdam";
        HashMap<Character, Integer> checkword = new HashMap<>();
        checkword.put('a', 2);
        checkword.put('d', 1);
        checkword.put('m', 2);

        HashMap result = countLetters.occuranceFinder(searchable);

        assertEquals(checkword, result);




    }
}