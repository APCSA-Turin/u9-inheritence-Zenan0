package U9T6;

public class ShippingItem {
    private double weight; // in ounces
    private static double COST_PER_OZ = 1.5;

    public ShippingItem(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return weight * COST_PER_OZ;
    }
}
