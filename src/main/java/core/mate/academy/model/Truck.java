package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int capacity;

    public Truck() {
    }

    public Truck(int capacity, String color, String name) {
        this.capacity = capacity;
        super.setColor(color);
        super.setName(name);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
