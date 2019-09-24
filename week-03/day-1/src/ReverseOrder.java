import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        Path filepath = Paths.get("reversed_order.txt");
        orderChanger(filepath);

    }
    public static void orderChanger (Path filepath) {

        try{
            List<String> lines = Files.readAllLines(filepath);
            List<String> reversed = new ArrayList<>();

            for (int i = 0; i < lines.size()-1; i++) {
                reversed.add(lines.get(lines.size()-1-i));
            }

            Files.write(filepath,reversed);


        } catch (IOException e) {

        }


    }
}
