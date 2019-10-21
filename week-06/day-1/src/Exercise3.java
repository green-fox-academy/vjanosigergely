import static java.lang.Math.pow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    List<Integer> squaredNumbers = numbers.stream()
        .filter(n -> Math.pow(n,2) > 20)
        .collect(Collectors.toList());
  }

}


//Write a Stream Expression to find which number squared value is more then 20 from the following list:
//
//List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);