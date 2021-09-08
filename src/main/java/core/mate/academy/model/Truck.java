package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelsNum;

    public Truck() {
    }

    public Truck(int wheelsNum, String name, String color) {
        this.wheelsNum = wheelsNum;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
