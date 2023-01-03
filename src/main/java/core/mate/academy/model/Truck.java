package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckBodyVolume;
    private int manufactureYear;

    public Truck() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getTruckBodyVolume() {
        return truckBodyVolume;
    }

    public void setTruckBodyVolume(int truckBodyVolume) {
        this.truckBodyVolume = truckBodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
