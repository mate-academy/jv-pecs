package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean secondBucket;
    private boolean sideKnife;
    private int wheelNumber;

    public Bulldozer() {
    }

    public Bulldozer(boolean secondBucket, boolean sideKnife, int wheelNumber) {
        this.secondBucket = secondBucket;
        this.sideKnife = sideKnife;
        this.wheelNumber = wheelNumber;
    }

    public boolean isSecondBucket() {
        return secondBucket;
    }

    public void setSecondBucket(boolean secondBucket) {
        this.secondBucket = secondBucket;
    }

    public boolean isSideKnife() {
        return sideKnife;
    }

    public void setSideKnife(boolean sideKnife) {
        this.sideKnife = sideKnife;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
