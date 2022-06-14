package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfTrailer;

    public Truck() {
        super("", "");
    }

    public Truck(String name, String color, int numberOfTrailer) {
        super(name, color);
        this.numberOfTrailer = numberOfTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getNumberOfTrailer() {
        return numberOfTrailer;
    }

    public void setNumberOfTrailer(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }
}
