package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int boomHeight;
    private int bucketVolume;
    private ExcavatorType excavatorType;

    public Excavator(int boomHeight, int bucketVolume, ExcavatorType excavatorType) {
        this.boomHeight = boomHeight;
        this.bucketVolume = bucketVolume;
        this.excavatorType = excavatorType;
    }

    public Excavator() {
    }

    public int getBoomHeight() {
        return boomHeight;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public ExcavatorType getExcavatorType() {
        return excavatorType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public enum ExcavatorType {
        HYDRAULIC,
        PNEUMATIC,
        ON_THE_ROPES;
    }
}
