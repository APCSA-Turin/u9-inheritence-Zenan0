package U9T1L3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Electric car: " + electric);
        System.out.println("Discount applied: " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        } else {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (discountApplied != true && electric == true) {
            discountApplied = true;
            setTollFee(getTollFee() / 2);
        }
    }

    public void setDiscount(boolean bool) {
      discountApplied = bool;
    }

    @Override
    public double calculateTollPrice() {
      if (getPassengers() >= 4) {
        return getTollFee() * 4;
      }
      return super.calculateTollPrice();
    }
  }