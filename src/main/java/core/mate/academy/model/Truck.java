package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private boolean hasBedInCabin;

    public Truck() {
    }

    public Truck(String engine, int maxSpeedKmH, boolean hasBedInCabin) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.hasBedInCabin = hasBedInCabin;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMaxSpeedKmH() {
        return maxSpeedKmH;
    }

    public void setMaxSpeedKmH(int maxSpeedKmH) {
        this.maxSpeedKmH = maxSpeedKmH;
    }

    public boolean isHasBedInCabin() {
        return hasBedInCabin;
    }

    public void setHasBedInCabin(boolean hasBedInCabin) {
        this.hasBedInCabin = hasBedInCabin;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
