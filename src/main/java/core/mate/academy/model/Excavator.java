package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorBrand;
    private double bucketVolume;

    public Excavator() {
    }

    public Excavator(String excavatorBrand, double bucketVolume) {
        this.excavatorBrand = excavatorBrand;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
