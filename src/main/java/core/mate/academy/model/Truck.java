package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckType;

    public Truck() {
    }

    public Truck(String truckType) {
        this.truckType = truckType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
