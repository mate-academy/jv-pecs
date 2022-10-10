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

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public int getLengthOfCrawler() {
        return lengthOfCrawler;
    }

    public void setLengthOfCrawler(int lengthOfCrawler) {
        this.lengthOfCrawler = lengthOfCrawler;
    }

    public int getWeightBucket() {
        return weightBucket;
    }

    public void setWeightBucket(int weightBucket) {
        this.weightBucket = weightBucket;
    }
}
