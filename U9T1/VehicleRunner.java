package U9T1;

public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle myBicycle = new Bicycle("bike1", 2, 10);
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        myBicycle.move(10);
        myBicycle.turn();
        myBicycle.brake();
        myBicycle.ringBell();
        System.out.println(myBicycle.getGearCount());

        Skateboard mySkateboard = new Skateboard("skate", 4, 5);
        System.out.println(mySkateboard.getName());
        System.out.println(mySkateboard.getWheels());
        System.out.println(mySkateboard.getFlips());
        mySkateboard.move(100);
        mySkateboard.turn();
        mySkateboard.brake();
        mySkateboard.flip();
    }
}