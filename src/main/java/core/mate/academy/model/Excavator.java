package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorType;
    private double bucketCapacity;
    private double boomLength;

    public Excavator() {
    }

    public Excavator(String excavatorType,
                     double bucketCapacity, double boomLength) {
        this.excavatorType = excavatorType;
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
