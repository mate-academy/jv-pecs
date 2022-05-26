package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxMass;

    public Truck() {
    }

    public Truck(String name, String color, int maxMass) {
        super(name, color);
        this.maxMass = maxMass;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxMass() {
        return maxMass;
    }

    public void setMaxMass(int maxMass) {
        this.maxMass = maxMass;
    }
}
