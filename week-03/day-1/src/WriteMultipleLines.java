import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String filepath = "my-file.txt";
        String word = "apple";
        int repetition = 5;

        lineWriter(filepath,word,repetition);

    }
    public static void lineWriter (String path, String word, int repetition){
        Path filepath = Paths.get(path);
        List<String> words = new ArrayList<>();
        for (int i = 0; i < repetition; i++) {
            words.add(word);
        }
        try {
            Files.write(filepath,words);
        } catch (Exception e) {
        }

    }
}


// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.