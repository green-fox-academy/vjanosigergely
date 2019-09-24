import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String s = "my-file.txt";
        System.out.println(lineCounter(s));

    }
    public static int lineCounter (String filename){
        Path filepath = Paths.get(filename);
        int lineNumber;

        try {
            List<String> lines = Files.readAllLines((filepath));
            lineNumber = lines.size();
        }catch (IOException e) {
            lineNumber = 0;
        }
        return lineNumber;
    }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.