package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoadCapacity;
    private int maxWorkingLoad;

    public Truck() {
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public void setMaxWorkingLoad(int maxWorkingLoad) {
        this.maxWorkingLoad = maxWorkingLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
