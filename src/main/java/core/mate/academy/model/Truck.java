package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {
    private String cabinType;
    private int maxCapacity;

    public Truck(String cabinType, int maxCapacity) {
        this.cabinType = cabinType;
        this.maxCapacity = maxCapacity;
    }

    public Truck() {
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
