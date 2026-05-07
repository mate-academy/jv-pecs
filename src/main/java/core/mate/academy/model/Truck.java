package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckPlace;
    private int truckSize;

    public Truck() {
    }

    public Truck(int truckPlace, int truckSize) {
        this.truckPlace = truckPlace;
        this.truckSize = truckSize;
    }

    public int getTruckPlace() {
        return truckPlace;
    }

    public void setTruckPlace(int truckPlace) {
        this.truckPlace = truckPlace;
    }

    public int getTruckSize() {
        return truckSize;
    }

    public void setTruckSize(int truckSize) {
        this.truckSize = truckSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
