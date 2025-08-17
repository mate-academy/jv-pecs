package core.mate.academy.model;

public class Truck extends Machine {
    private int vanCapacity;
    private String typeTruck;

    public Truck() {
    }

    public Truck(int vanWidth, String vanHeight) {
        this.vanCapacity = vanWidth;
        this.typeTruck = vanHeight;
    }

    public int getTruckCapacity() {
        return vanCapacity;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.vanCapacity = truckCapacity;
    }

    public String getVanHeight() {
        return typeTruck;
    }

    public void setVanHeight(String vanHeight) {
        this.typeTruck = vanHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
