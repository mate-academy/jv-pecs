package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String dozerBucketType;
    private double maxLiftingWeight;
    private double maxLengthInBucket;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    public Bulldozer(
            String name, String color, String dozerBucketType,
            double maxLiftingWeight, double maxLengthInBucket) {
        super(name, color);
        this.dozerBucketType = dozerBucketType;
        this.maxLiftingWeight = maxLiftingWeight;
        this.maxLengthInBucket = maxLengthInBucket;
    }

    public String getDozerBucketType() {
        return dozerBucketType;
    }

    public void setDozerBucketType(String dozerBucketType) {
        this.dozerBucketType = dozerBucketType;
    }

    public double getMaxLiftingWeight() {
        return maxLiftingWeight;
    }

    public void setMaxLiftingWeight(double maxLiftingWeight) {
        this.maxLiftingWeight = maxLiftingWeight;
    }

    public double getMaxLengthInBucket() {
        return maxLengthInBucket;
    }

    public void setMaxLengthInBucket(double maxLengthInBucket) {
        this.maxLengthInBucket = maxLengthInBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
