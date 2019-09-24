import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        Path filepath = Paths.get("log.txt");

        uniqueIP(filepath);

    }
    public static String [] uniqueIP (Path filepath){

        try{
            List<String> lines = Files.readAllLines(filepath);
            String [] subLines = new String[lines.size()];

            for (int i = 0; i < lines.size()-1 ; i++) {
                 subLines[i] = lines.get(i).substring(27,38);
            }

            Arrays.sort(subLines);
            int counter = 0;

            for (int i = 0; i < lines.size()-2; i++) {
                if (subLines[i+1] == subLines [i]) {
                    counter = counter +1;
                }
            }
            String [] sorted = new String[counter];

            for (int i = 0; i < subLines.length ; i++) {
                for (int j = 0; j < counter ; j++) {
                    if (subLines[i+1])

                    sorted[j] = subLines[i]
                }
            }


        } catch (IOException e) {

        }

        String [] goBack = new String[10];

        return goBack;
    }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
