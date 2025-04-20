package U9T1;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", 20, 150);
        person1.printName();
        person1.printAge();
        person1.printHeight();

        Student student1 = new Student("Oscar", 5, 5, 3, 0);
        student1.printName();
        student1.printAge();
        student1.printHeight();
        student1.printGradeLevel();
        student1.printGPA();

        Teacher teacher1 = new Teacher("Bryan", 75, 3, "Gym", 2);
        teacher1.printName();
        teacher1.printAge();
        teacher1.printHeight();
        teacher1.printSubject();
        teacher1.printStudents();
    }
}
