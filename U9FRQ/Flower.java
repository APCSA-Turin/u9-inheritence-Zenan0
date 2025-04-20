package U9FRQ;

public class Flower extends Plant{
    private int petals;
  
    public Flower(String n, int p) {
      super(n);
      petals = p;
    }
  
    public void info() {
      super.info();
      System.out.println("Petals: " + petals);
    }
  
    public void losePetals(int p) {
      petals -= p;
    }
  
    public int getPetals() {
     return petals;
    }
  }
  