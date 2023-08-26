package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volumeOfTheTank;

    public Truck() {
    }

    public int getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public void setVolumeOfTheTank(int volumeOfTheTank) {
        this.volumeOfTheTank = volumeOfTheTank;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
