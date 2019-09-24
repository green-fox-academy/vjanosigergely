import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        Path filepath = Paths.get("zenOfPython.txt");
        doubled(filepath);
    }
    public static void doubled (Path filepath){


        try {
            List<String> lines = Files.readAllLines(filepath);
            List<String> doubled = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                String s = "";
                if (lines.get(i).length() > 0){
                s = s + lines.get(i).charAt(0);}
                for (int j = 0; j < lines.get(i).length()-1 ; j++) {
                    if (lines.get(i).charAt(j+1) != lines.get(i).charAt(j)) {
                        s = s + lines.get(i).charAt(j+1);
                    }
                }

                doubled.add(s);
            }
            Files.write(filepath,doubled);

        } catch (IOException e) {

        }


    }

}
