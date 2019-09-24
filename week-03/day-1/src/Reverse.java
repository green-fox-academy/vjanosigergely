import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        Path filepath = Paths.get("C:\\Users\\vjano\\greenfox\\vjanosigergely\\week-03\\day-1\\reverse.txt");
        reverse(filepath);
    }
    public static void reverse (Path filepath) {

        try {
            List<String> lines = Files.readAllLines(filepath);
            List<String> reversed = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                String s = "";
                int length = lines.get(i).length();

                for (int j = length-1; j >= 0 ; j--) {
                     s = s + lines.get(i).charAt(j);
                }
                reversed.add(s);
            }
            Files.write(filepath,reversed);

        } catch (IOException e) {
            System.out.println("Hat ez most nem jott be");
        }


    }
}

