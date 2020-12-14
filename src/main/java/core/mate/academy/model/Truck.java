package core.mate.academy.model;

public class Truck extends Machine {
    private int vanWidth;
    private int vanHeight;

    public Truck() {
    }

    public int getTruckCapacity() {
        return vanWidth;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.vanWidth = truckCapacity;
    }

    public int getVanHeight() {
        return vanHeight;
    }

    public void setVanHeight(int vanHeight) {
        this.vanHeight = vanHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
