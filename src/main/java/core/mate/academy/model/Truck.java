package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double truckBodyArea;

    public Truck() {
    }

    public Truck(double truckBodyArea) {
        this.truckBodyArea = truckBodyArea;
    }

    public double getTruckBodyArea() {
        return truckBodyArea;
    }

    public void setTruckBodyArea(double truckBodyArea) {
        this.truckBodyArea = truckBodyArea;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
