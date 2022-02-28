package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckCapacity;

    public Truck() {
    }

    public Truck(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public String toString() {
        return "Truck{"
                + "truckCapacity="
                + truckCapacity
                + '}';
    }
}

