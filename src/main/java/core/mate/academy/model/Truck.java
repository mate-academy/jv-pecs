package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int id;
    private double capacity;

    public Truck() {

    }

    public Truck(String name, String color, int id, double capacity) {
        super(name, color);
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
