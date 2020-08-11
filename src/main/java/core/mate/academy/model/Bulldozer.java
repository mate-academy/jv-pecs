package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean isBucketInjured;
    private int pushingPower;

    public Bulldozer() {
    }

    public Bulldozer(boolean isBucketInjured, int pushingPower) {
        this.isBucketInjured = isBucketInjured;
        this.pushingPower = pushingPower;
    }

    public boolean isBucketInjured() {
        return isBucketInjured;
    }

    public void setBucketInjured(boolean bucketInjured) {
        isBucketInjured = bucketInjured;
    }

    public int getPushingPower() {
        return pushingPower;
    }

    public void setPushingPower(int pushingPower) {
        this.pushingPower = pushingPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
