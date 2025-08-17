package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int capacity;

    public Truck() {
    }

    public Truck(String name, String color, int capacity) {
        setName(name);
        setColor(color);
        this.capacity = capacity;
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
