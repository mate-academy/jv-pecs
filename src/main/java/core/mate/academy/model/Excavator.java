package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String color;
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(String color, int bucketCapacity) {
        this.color = color;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Excavator{"
                + "color='" + color + '\''
                + ", bucketCapacity=" + bucketCapacity
                + '}';
    }
}
