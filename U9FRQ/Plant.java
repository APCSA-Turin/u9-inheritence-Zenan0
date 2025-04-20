package U9FRQ;

public class Plant{
    private String name;
  
    public Plant(String n) {
      name = n;
    }
  
    public void info() {
      System.out.println("Name: " + name);
    }
  
    public String getName() {
      return name;
    }
  }
  