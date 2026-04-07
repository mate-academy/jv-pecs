package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketSize;
    private int weight;
    private int trackWidth;

    public Bulldozer(int bucketSize, int weight, int trackWidth) {
        this.bucketSize = bucketSize;
        this.weight = weight;
        this.trackWidth = trackWidth;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
