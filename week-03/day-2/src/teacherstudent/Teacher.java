package teacherstudent;

public class Teacher {

    Teacher (){

    }

    public void teach(Student student){
        student.learn();
    }

    public void answer (){
        System.out.println("The teacher is answering a question");
    }
}
