package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodySizeLength;

    public Truck() {
    }

    public Truck(String name, String color, int bodySizeLength) {
        super(name, color);
        this.bodySizeLength = bodySizeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getBodySizeLength() {
        return bodySizeLength;
    }

    public void setBodySizeLength(int bodySizeLength) {
        this.bodySizeLength = bodySizeLength;
    }
}
