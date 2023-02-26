package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailer;

    public Truck() {
    }

    public Truck(int trailer) {
        this.trailer = trailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTrailer() {
        return trailer;
    }

    public void setTrailer(int trailer) {
        this.trailer = trailer;
    }
}
