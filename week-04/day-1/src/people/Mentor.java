package people;

public class Mentor extends Person {
    String level = "intermediate";

    Mentor(){
        super();
    }

    Mentor (String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, my name is " + name + " I am a " + age + " years old " + gender + level + " level mentor" );
    }
}

//Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//level: the level of the mentor (junior / intermediate / senior)
//methods:
//getGoal(): prints out "Educate brilliant junior software developers."
//introduce(): "Hi, I'm name, a age year old gender level mentor."
//The Mentor class has the following constructors:
//
//Mentor(name, age, gender, level)
//Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate