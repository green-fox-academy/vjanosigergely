package people;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor (){
        super();
        company = "Google";
        hiredStudents = 0;
    }

    Sponsor (String name, int age, String gender, String company){
        super(name,age,gender);
        this.company = company;
        hiredStudents = 0;
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println("Hi, my name is " + name + " I am a " + age + " years old " + gender +
                " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

}

//Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//company: name of the company
//hiredStudents: number of students hired
//method:
//introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
//hire(): increase hiredStudents by 1
//getGoal(): prints out "Hire brilliant junior software developers."
//The Sponsor class has the following constructors:
//
//Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
