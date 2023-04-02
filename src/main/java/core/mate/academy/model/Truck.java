package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truColor;
    private int truHeight;
    private int truLength;

    public Truck(String truColor, int truHeight, int truLength) {
        this.truColor = truColor;
        this.truHeight = truHeight;
        this.truLength = truLength;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
