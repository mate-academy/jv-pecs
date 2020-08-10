package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxSpeed;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(int maxSpeed, double bucketCapacity) {
        this.maxSpeed = maxSpeed;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
