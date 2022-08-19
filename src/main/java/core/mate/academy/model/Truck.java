package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engineType;
    private boolean haveTrailer;
    private int maxWeight;

    public Truck(String engineType, boolean haveTrailer, int maxWeight) {
        this.engineType = engineType;
        this.haveTrailer = haveTrailer;
        this.maxWeight = maxWeight;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
