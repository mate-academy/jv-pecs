package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double sizeFrontBucket;
    private int lengthMovingOfBreed;

    public Bulldozer() {
    }

    public Bulldozer(double sizeBucket, int lengthMovingOfBreed) {
        this.sizeFrontBucket = sizeBucket;
        this.lengthMovingOfBreed = lengthMovingOfBreed;
    }

    public double getSizeFrontBucket() {
        return sizeFrontBucket;
    }

    public void setSizeFrontBucket(double sizeFrontBucket) {
        this.sizeFrontBucket = sizeFrontBucket;
    }

    public int getLengthMovingOfBreed() {
        return lengthMovingOfBreed;
    }

    public void setLengthMovingOfBreed(int lengthMovingOfBreed) {
        this.lengthMovingOfBreed = lengthMovingOfBreed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
