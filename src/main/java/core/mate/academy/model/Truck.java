package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxTonnage;
    private int mileage;

    public Truck(int maxTonnage, int mileage) {
        this.maxTonnage = maxTonnage;
        this.mileage = mileage;
    }

    public Truck() {

    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
