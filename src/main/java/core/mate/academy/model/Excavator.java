package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasCaterpillar;
    private double bucketVolume;
    private int bucketsNumber;

    public Excavator() {
    }

    public Excavator(boolean hasCaterpillar, double bucketVolume, int bucketsNumber) {
        this.hasCaterpillar = hasCaterpillar;
        this.bucketVolume = bucketVolume;
        this.bucketsNumber = bucketsNumber;
    }

    public boolean isHasCaterpillar() {
        return hasCaterpillar;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public int getBucketsNumber() {
        return bucketsNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
