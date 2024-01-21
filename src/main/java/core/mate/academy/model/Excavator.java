package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private float diggingDepth;
    private float bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, float diggingDepth, float bucketCapacity) {
        this.setName(name);
        this.setColor(color);
        this.diggingDepth = diggingDepth;
        this.bucketCapacity = bucketCapacity;
    }

    public float getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(float diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public float getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(float bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator[name= " + getName() + ", color= " + getColor()
                + ", digging depth= " + getDiggingDepth()
                + ", bucket capacity= " + getBucketCapacity() + "]";
    }
}
