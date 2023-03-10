package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String ExcavatorModel;
    private int bucketVolume;

    public Excavator() {
    }

    public String getExcavatorModel() {
        return ExcavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        ExcavatorModel = excavatorModel;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
