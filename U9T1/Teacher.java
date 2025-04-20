package U9T1;

public class Teacher extends Person{
    private String subject;
    private int students;

    public Teacher(String name, int age, int height, String subject, int students) {
        super(name, age, height);
        this.subject = subject;
        this.students = students;
    }

    public void printSubject() {
        System.out.println("Subject is " + subject);
    }

    public void printStudents() {
        System.out.println("Number of students is " + students);
    }
}
