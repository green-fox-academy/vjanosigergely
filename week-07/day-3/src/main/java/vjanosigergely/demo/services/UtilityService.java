package vjanosigergely.demo.services;

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

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for(int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}