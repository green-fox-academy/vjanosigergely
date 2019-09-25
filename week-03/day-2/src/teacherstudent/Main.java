package teacherstudent;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Teacher firstTeacher = new Teacher();

        firstStudent.question(firstTeacher);
        firstTeacher.teach(firstStudent);
    }
}
