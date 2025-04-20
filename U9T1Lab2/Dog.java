package U9T1Lab2;

public class Dog extends Animal{
    private int feetTraveled;
    private boolean hasBeenWalked;

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
        hasBeenWalked = false;
        feetTraveled = 0;
    }

    public void walk(int distance) {
        System.out.println(getName() + " has gone on a walk.");
        hasBeenWalked = true;
        feetTraveled += distance;
    }

    public boolean hasBeenWalked() {
        return hasBeenWalked;
    }

    public int getFeetTraveled() {
        return feetTraveled;
    }

    public void fetch(int throwDistance) {
        System.out.println("You threw the stick " + throwDistance + " feet away.");
        feetTraveled += throwDistance * 2;
    }
}
