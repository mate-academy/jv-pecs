package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private int bucketWidth;

    public Bulldozer() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
