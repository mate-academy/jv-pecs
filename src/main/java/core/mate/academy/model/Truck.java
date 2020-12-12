package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckSpeed;
    private String truckColor;

    public int getTruckSpeed() {
        return truckSpeed;
    }

    public void setTruckSpeed(int truckSpeed) {
        this.truckSpeed = truckSpeed;
    }

    public String getTruckColor() {
        return truckColor;
    }

    public void setTruckColor(String truckColor) {
        this.truckColor = truckColor;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
