package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int lengthOfArm;
    private int sizeOfBucket;
    private int cabCapacity;

    public Excavator(int lengthOfArm, int sizeOfBucket, int cabCapacity) {
        this.lengthOfArm = lengthOfArm;
        this.sizeOfBucket = sizeOfBucket;
        this.cabCapacity = cabCapacity;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
