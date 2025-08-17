package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorBucket;

    public Excavator() {
    }

    public Excavator(String name, String color, int excavatorBucket) {
        super(name, color);
        this.excavatorBucket = excavatorBucket;
    }

    public int getExcavatorBucket() {
        return excavatorBucket;
    }

    public void setExcavatorBucket(int excavatorBucket) {
        this.excavatorBucket = excavatorBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
