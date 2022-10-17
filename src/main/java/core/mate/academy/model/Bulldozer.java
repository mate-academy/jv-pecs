package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int lengthOfCrawler;
    private int weightBucket;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setLengthOfCrawler(int lengthOfCrawler) {
        this.lengthOfCrawler = lengthOfCrawler;
    }

    public void setWeightBucket(int weightBucket) {
        this.weightBucket = weightBucket;
    }
}
