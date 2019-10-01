package people;

public class Student extends Person implements Cloneable {

    String previousOrganization = "The School of Life";
    int skippedDays = 0;

    Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;

    }
    Student(){
        super();

    }

    public void getGoal (){
        System.out.println("Be a junior software developer");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }


    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + name + " I am a " + age + " years old " + gender +
                " who skipped " + skippedDays + "from the course already" );
    }

    /*public Student clone(Student original){
        *//*Student clone = new Student();
        clone = original;*//*

        return clone;
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


//fields:
//previousOrganization: the name of the student’s previous company / school
//skippedDays: the number of days skipped from the course
//methods:
//getGoal(): prints out "Be a junior software developer."
//introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//skipDays(numberOfDays): increases skippedDays by numberOfDays
//The Student class has the following constructors:
//
//Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0