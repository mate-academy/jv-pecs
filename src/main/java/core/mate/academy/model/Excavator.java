package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int height;

    public Excavator() {
        super("Default name", "Default color");
    }

    public Excavator(String name, String color, int bucketCapacity, int height) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.height = height;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
