package U9T1Lab2;

public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        vaccinated = false;
        this.weight = weight;
    }

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }

    public void feed() {
        System.out.println(name + " has been fed!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public double getWeight() {
        return weight;
    }

    public void vaccinate() {
        if (!vaccinated) {
            System.out.println(name + " has been vaccinated!");
            vaccinated = true;
        } else {
            System.out.println("This animal has already been vaccinated!");
        }
    }
}
