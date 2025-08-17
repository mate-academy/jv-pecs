package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typesOfTrucks;

    public Truck() {
    }

    public Truck(String typesOfTrucks) {
        this.typesOfTrucks = typesOfTrucks;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
