package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean isDamaged;

    public Truck() {
    }

    public Truck(String name, String color, boolean isDamaged) {
        super(name, color);
        this.isDamaged = isDamaged;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
