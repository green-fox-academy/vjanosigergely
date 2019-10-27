import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    String starterLetter = "a";

    List<String> selectedCities = cities.stream()
        .filter(c -> c.startsWith(starterLetter.toUpperCase()))
        .collect(Collectors.toList());
  }

}

//Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list: