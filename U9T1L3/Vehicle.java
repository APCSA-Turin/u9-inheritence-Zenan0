package U9T1L3;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void setPassengers(int passengers) {
      this.passengers = passengers;
    }

    public void setTollFee(double toll) {
      tollFee = toll;
    }
    
    public void printInfo() {
      System.out.println("License plate: " + licensePlate);
      System.out.println("Toll fee: " + tollFee);
      System.out.println("Passengers: " + passengers);
    }

    public void isTaxi() {
      System.out.println("This is not a taxi.");
    }
  }