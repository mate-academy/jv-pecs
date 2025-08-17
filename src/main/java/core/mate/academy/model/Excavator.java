package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(int bucketCapacity, String color, String name) {
        this.bucketCapacity = bucketCapacity;
        super.setColor(color);
        super.setName(name);
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
