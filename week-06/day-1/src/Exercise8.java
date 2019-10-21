import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {
    List<Character> myCharList = Arrays.asList(new Character[]{'w', 'h', 'a', 't', ' ','i','s', ' ', 't','h','i','s','?'});
    String text = myCharList.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());

  }

}

//Write a Stream Expression to concatenate a Character list to a string!