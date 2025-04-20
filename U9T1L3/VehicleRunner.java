package U9T1L3;

public class VehicleRunner {
    public static void main(String[] args) {
      Vehicle myVehicle = new Vehicle("A", 10, 2);
      Car myCar = new Car("B", 10, 5, false);
      Truck myTruck = new Truck("C", 10, 1, 4, true);
      Taxi myTaxi = new Taxi("D", 10, 2, false, 10);
      myVehicle.isTaxi();
      myCar.isTaxi();
      myTruck.isTaxi();
      myTaxi.isTaxi();
    }
}