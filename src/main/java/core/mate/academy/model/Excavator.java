package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double armLength;
    private double bucketCapacity;
    private String engineType;

    public Excavator() {
    }

    public Excavator(double armLength, double bucketCapacity, String engineType) {
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
        this.engineType = engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
