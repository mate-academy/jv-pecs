package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketSize;

    public Bulldozer() {
    }

    public Bulldozer(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBucketSize() {
        return bucketSize;
    }
}


