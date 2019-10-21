import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {

  public static void main(String[] args) {
    String text = "My Hovercraft is full of eels";

    HashMap<Character, Integer> frequency = (HashMap<Character, Integer>) text.toLowerCase().replaceAll(" ", "").chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(c -> 1)));
  }

}


//Write a Stream Expression to find the frequency of characters in a given string!
//Map<Character, Integer> frequency =
//            str.chars()
//               .mapToObj(c -> (char)c)
//               .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));