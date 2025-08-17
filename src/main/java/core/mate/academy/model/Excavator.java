package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucket;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucket) {
        this.setName(name);
        this.setColor(color);
        this.bucket = bucket;
    }

    public int getBucket() {
        return bucket;
    }

    public void setBucket(int bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
