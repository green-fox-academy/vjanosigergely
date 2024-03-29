import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {

  public static void main(String[] args) {
    String text = "WabbaLabaDubDub";

    Stream<Character> charStream = text.chars().mapToObj(c -> (char) c);
    List<Character> upperCaseChars = charStream
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());

  }

}

//Exercise 6
//Write a Stream Expression to find the uppercase characters in a string!
//Stream<String> stringStream = testString.codePoints()
//  .mapToObj(c -> String.valueOf((char) c));