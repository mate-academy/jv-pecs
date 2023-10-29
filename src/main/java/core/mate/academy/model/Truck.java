package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int carryingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int carryingCapacity) {
        super(name, color);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
