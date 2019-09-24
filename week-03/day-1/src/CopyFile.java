import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String copyFrom = "my-files3.txt";
        String copyTo = "my-files2.txt";

        System.out.println(fileCopier(copyFrom,copyTo));

    }
    public static boolean fileCopier (String fileName1, String fileName2) {
        Path file1Path = Paths.get(fileName1);
        Path file2Path = Paths.get(fileName2);
        boolean copy;

        List<String> copyFrom = new ArrayList<>();

        try {
            copyFrom = Files.readAllLines(file1Path);
            Files.write(file2Path,copyFrom);
            copy = true;
        } catch (IOException e) {
            copy = false;
        }

        return copy;
    }
}
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful