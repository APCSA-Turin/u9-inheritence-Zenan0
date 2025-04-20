package U9T1Lab2;

public class Cat extends Animal{
    private boolean hasPlayedWith;
    private int miceCaught;

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
        hasPlayedWith = false;
        miceCaught = 0;
    }

    public void play() {
        System.out.println(getName() + " has been played with.");
        hasPlayedWith = true;
    }

    public boolean hasPlayedWith() {
        return hasPlayedWith;
    }

    public void catchMouse() {
        System.out.println(getName() + " has caught a mouse.");
        miceCaught++;
    }

    public int getMiceCaught() {
        return miceCaught;
    }
}
