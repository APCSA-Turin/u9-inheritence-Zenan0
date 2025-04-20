package U9FRQ;

public class Rose extends Flower{
    private String color;
  
    public Rose(String n, int p, String c) {
      super(n, p);
      color = c;
    }
  
    public void info() {
      super.info();
      System.out.println("Color: " + color);
    }
  
    public String getColor() {
      return color;
    }
  }
  