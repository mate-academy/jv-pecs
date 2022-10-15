package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int frontWheelsArea;
    private int rearWheelsArea;

    public Truck() {
    }

    public Truck(int frontWheelsArea, int rearWheelsArea) {
        this.frontWheelsArea = frontWheelsArea;
        this.rearWheelsArea = rearWheelsArea;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
