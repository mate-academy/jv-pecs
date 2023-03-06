package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dozerBucketSize;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, int dozerBucketSize) {
        super(name, color);
        this.dozerBucketSize = dozerBucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
