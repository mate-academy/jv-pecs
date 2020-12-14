package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private boolean isNew;

    public Excavator(int bucketVolume, boolean isNew) {
        this.bucketVolume = bucketVolume;
        this.isNew = isNew;
    }

    public Excavator() {

    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
