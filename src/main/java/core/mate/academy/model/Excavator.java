package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketType;
    private int serialNumOfBucket;
    private int bucketLoading;

    public Excavator() {
    }

    public Excavator(String bucketType, int serialNumOfBucket, int bucketLoading) {
        this.bucketType = bucketType;
        this.serialNumOfBucket = serialNumOfBucket;
        this.bucketLoading = bucketLoading;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
