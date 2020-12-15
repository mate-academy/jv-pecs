package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weightBucket;

    public Bulldozer(int weightBucket) {
        this.weightBucket = weightBucket;
    }

    public Bulldozer() {
    }

    public int getWeightBucket() {
        return weightBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
