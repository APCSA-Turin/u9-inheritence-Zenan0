package U9T1L3;

public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (isDiscountApplied() == false && getPassengers() >= 4) {
            setDiscount(true);
            setTollFee(getTollFee() / 2);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void isTaxi() {
        System.out.println("This is a taxi.");
    }
}
