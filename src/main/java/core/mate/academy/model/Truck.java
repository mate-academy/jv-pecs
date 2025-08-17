package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeTruck;
    private int weightTruck;

    public Truck() {
    }

    public Truck(String typeTruck, int weightTruck) {
        this.typeTruck = typeTruck;
        this.weightTruck = weightTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
