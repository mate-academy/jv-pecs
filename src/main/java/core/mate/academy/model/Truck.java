package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoad;
    private String trailerType;

    public Truck() {
    }

    public Truck(int maxLoad, String trailerType) {
        this.maxLoad = maxLoad;
        this.trailerType = trailerType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
