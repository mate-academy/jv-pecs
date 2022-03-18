package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int doors;

    public Truck() {
    }

    public Truck(String name, String color, int doors) {
        super(name, color);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
