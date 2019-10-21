import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {
  String name;
  String color;
  int age;

  Fox(String name, String color, int age){
    this.name = name;
    this.age = age;
    this.color = color.toLowerCase();
  }

  public static void main(String[] args) {
    ArrayList<Fox> myFoxes = new ArrayList<>();
    myFoxes.add(new Fox("Vuk","orange", 6));
    myFoxes.add(new Fox("Karak","yellow", 20));
    myFoxes.add(new Fox("Vivi","green", 26));
    myFoxes.add(new Fox("Laci","red", 28));
    myFoxes.add(new Fox("Szabi","green", 21));
    myFoxes.add(new Fox("Csoszi","green", 2));
    myFoxes.add(new Fox("Riel","white", 8));
    myFoxes.add(new Fox("Fitzgerald","green", 1));

    //Write a Stream Expression to find the foxes with green color!
    List<Fox> greenFoxes = myFoxes.stream()
        .filter(f -> f.color == "green")
        .collect(Collectors.toList());
    //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    List<Fox> greenAndYoung = greenFoxes.stream()
        .filter(f -> f.age < 5)
        .collect(Collectors.toList());
    //Write a Stream Expression to find the frequency of foxes by color!

  }

}


//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//Write a Stream Expression to find the foxes with green color!
//Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//Write a Stream Expression to find the frequency of foxes by color!