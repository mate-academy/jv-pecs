package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int productivity;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketCapacity, int productivity) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.productivity = productivity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }
}
