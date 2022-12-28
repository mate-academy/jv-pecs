package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engine;
    private String typeOfTruck;
    private int weightInKG;

    public Truck(String engine, String typeOfTruck, int weightInKG) {
        this.engine = engine;
        this.typeOfTruck = typeOfTruck;
        this.weightInKG = weightInKG;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
