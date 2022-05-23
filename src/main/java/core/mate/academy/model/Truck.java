package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int number;
    private boolean trailer;

    public Truck() {
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
