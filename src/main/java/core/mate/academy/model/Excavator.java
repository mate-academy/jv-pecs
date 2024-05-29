package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketSize;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketSize) {
        super(name, color);
        this.bucketSize = bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
