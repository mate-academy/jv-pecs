package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String name;
    private int height;
    private int length;

    public Truck(String truColor, int truHeight, int truLength) {
        this.name = truColor;
        this.height = truHeight;
        this.length = truLength;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
