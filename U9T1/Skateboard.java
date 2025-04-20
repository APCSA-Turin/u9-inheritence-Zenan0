package U9T1;

public class Skateboard extends Vehicle{
    private int flips;

    public Skateboard(String name, int wheels, int flips) {
        super(name, wheels);
        this.flips = flips;
    }

    public int getFlips() {
        return flips;
    }

    public void flip() {
        flips++;
        System.out.println("You just did a flip!");
    }
}
