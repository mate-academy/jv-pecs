package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int widthOfBucket;

    public Bulldozer(int enginePower, int widthOfBucket) {
        this.enginePower = enginePower;
        this.widthOfBucket = widthOfBucket;
    }

    public Bulldozer() {
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getWidthOfBucket() {
        return widthOfBucket;
    }

    public void setWidthOfBucket(int widthOfBucket) {
        this.widthOfBucket = widthOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
