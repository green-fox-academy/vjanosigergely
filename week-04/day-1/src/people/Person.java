package people;

public class Person {
    String name = "Jane Doe";
    int age = 30;
    String gender = "female";

    Person (String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
    }
    Person(){

    }

    public void introduce () {
        System.out.println("Hi, my name is " + name + " I am a " + age + " years old " + gender );
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
