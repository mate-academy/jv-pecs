package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private boolean isCaterpillar;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketSize, boolean isCaterpillar) {
        super(name, color);
        this.bucketSize = bucketSize;
        this.isCaterpillar = isCaterpillar;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public boolean isCaterpillar() {
        return isCaterpillar;
    }

    public void setCaterpillar(boolean caterpillar) {
        isCaterpillar = caterpillar;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
