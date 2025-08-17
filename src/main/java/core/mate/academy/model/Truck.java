package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int totalMass;

    public Truck() {
    }

    public Truck(String name, String color, int totalMass) {
        setName(name);
        setColor(color);
        this.totalMass = totalMass;
    }

    @Override
    public void doWork() {
        System.out.println(getColor() + " Truck " + getName() + " started to work");
    }
}
