import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void anagramFinder_SameWord (){
        String first = "mamamama";
        String second = "mamamama";
        boolean expected = true;
        boolean result = anagram.anagramFinder(first, second);

        assertEquals(expected,result);
    }
    @Test
    public void anagramFinder_Anagram (){
        String first = "mamamama";
        String second = "ammaamma";
        boolean expected = true;
        boolean result = anagram.anagramFinder(first, second);

        assertEquals(expected,result);
    }
    @Test
    public void anagramFinder_notAnagram_equallength (){
        String first = "mamamama";
        String second = "ammaamme";
        boolean expected = false;
        boolean result = anagram.anagramFinder(first, second);

        assertEquals(expected,result);
    }
    @Test
    public void anagramFinder_NotEqualLength (){
        String first = "mamamamafafa";
        String second = "ammaamme";
        boolean expected = false;
        boolean result = anagram.anagramFinder(first, second);

        assertEquals(expected,result);
    }


}