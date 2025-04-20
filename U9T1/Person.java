package U9T1;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printAge() {
        System.out.println("I am " + age + " years old.");
    }

    public void printHeight() {
        System.out.println("My height is " + height + " centimeters.");
    }

    public void printName() {
        System.out.println("My name is " + name);
    }
}
