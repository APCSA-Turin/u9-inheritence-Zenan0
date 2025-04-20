package U9T1L3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer == true) {
            if (axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
                return true;
            }
            if (axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public double calculateTollPrice() {
      double tollPrice = axles * getTollFee();
      if (hasTrailer) {
        tollPrice *= 2;
      }
      return tollPrice;
    }
  }