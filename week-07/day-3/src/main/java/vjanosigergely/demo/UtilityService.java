package vjanosigergely.demo;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
  //Create a `validateEmail` method in the `UtilityService`
  ////     - check if the string contains a `@` and a `.`

  public boolean validateEmail(String email){
    boolean isValid;
    isValid = email.contains("@") && email.contains(".");
    return isValid;
  }
}