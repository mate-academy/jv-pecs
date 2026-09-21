package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxDiggingDepth;
    private double bucketCapacity;
    
    public Excavator() {
    }
    
    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }
    
    public void setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }
    
    public double getBucketCapacity() {
        return bucketCapacity;
    }
    
    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }
    
    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
