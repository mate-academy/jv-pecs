package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckDriverAge = 20;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckDriverAge() {
        return truckDriverAge;
    }

    public void setTruckDriverAge(int truckDriverAge) {
        this.truckDriverAge = truckDriverAge;
    }
}
