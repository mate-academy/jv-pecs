package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxCargoWeight;
    private boolean haveExtraTrailer;

    public Truck() {
    }

    public Truck(int maxCargoWeight, boolean haveExtraTrailer) {
        this.maxCargoWeight = maxCargoWeight;
        this.haveExtraTrailer = haveExtraTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
