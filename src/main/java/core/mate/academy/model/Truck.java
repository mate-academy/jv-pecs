package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int capacity;

    public Truck() {
    }

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Truck setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
