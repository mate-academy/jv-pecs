package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSizeInCentimeters;
    
    public Excavator() {
    }
    
    public Excavator(String name, String color, int bucketSizeInCentimeters) {
        super(name, color);
        this.bucketSizeInCentimeters = bucketSizeInCentimeters;
    }
    
    public int getBucketSizeInCentimeters() {
        return bucketSizeInCentimeters;
    }
    
    public void setBucketSizeInCentimeters(int bucketSizeInCentimeters) {
        this.bucketSizeInCentimeters = bucketSizeInCentimeters;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
