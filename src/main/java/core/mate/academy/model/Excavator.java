package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorBucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int excavatorBucketCapacity) {
        super.setName(name);
        super.setColor(color);
        this.excavatorBucketCapacity = excavatorBucketCapacity;
    }

    public void setExcavatorBucketCapacity(int excavatorBucketCapacity) {
        this.excavatorBucketCapacity = excavatorBucketCapacity;
    }

    public int getExcavatorBucketCapacity() {
        return excavatorBucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
