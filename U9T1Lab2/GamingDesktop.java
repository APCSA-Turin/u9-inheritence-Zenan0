package U9T1Lab2;

public class GamingDesktop extends Desktop{
    private String graphicsCard;
    
    public GamingDesktop(int screenSize, int memory, boolean monitorIncluded, String graphicsCard) {
        super(screenSize, memory, monitorIncluded);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void updateDrivers() {
        System.out.println("Graphics card drivers have been updated!");
    }
}
