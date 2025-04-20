package U9T1;

public class Student extends Person{
    private int gradeLevel;
    private int gpa;

    public Student(String name, int age, int height, int gradeLevel, int gpa) {
        super(name, age, height);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void printGradeLevel() {
        System.out.println("My grade level is " + gradeLevel);
    }

    public void printGPA() {
        System.out.println("My GPA is " + gpa);
    }
}
