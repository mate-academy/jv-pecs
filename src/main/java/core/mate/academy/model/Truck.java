package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private Double dumpBedVolume;

    public Truck() {
    }

    public Double getDumpBedVolume() {
        return dumpBedVolume;
    }

    public void setDumpBedVolume(Double dumpBedVolume) {
        this.dumpBedVolume = dumpBedVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
