package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfAxles;
    private String bodyType;
    private int maxCargoWeight;

    public Truck() {
    }

    public Truck(int numberOfAxles,
                 String bodyType, int maxCargoWeight) {
        this.numberOfAxles = numberOfAxles;
        this.bodyType = bodyType;
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
