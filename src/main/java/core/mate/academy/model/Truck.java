package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String manufacturersOfTruck;
    private String typesBySize;

    public Truck(String manufacturersOfTruck, String typesBySize) {
        this.manufacturersOfTruck = manufacturersOfTruck;
        this.typesBySize = typesBySize;
    }

    public Truck() {

    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
