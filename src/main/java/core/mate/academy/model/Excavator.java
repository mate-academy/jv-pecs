package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorBucketVolume;
    private int manufactureYear;

    public Excavator() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getExcavatorBucketVolume() {
        return excavatorBucketVolume;
    }

    public void setExcavatorBucketVolume(int excavatorBucketVolume) {
        this.excavatorBucketVolume = excavatorBucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
