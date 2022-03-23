package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodyMass;
    private int axleMass;

    public Truck() {
    }

    public Truck(String name, String color, int bodyMass, int axleMass) {
        super(color, name);
        this.bodyMass = bodyMass;
        this.axleMass = axleMass;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getBodyMass() {
        return bodyMass;
    }

    public void setBodyMass(int bodyMass) {
        this.bodyMass = bodyMass;
    }

    public int getAxleMass() {
        return axleMass;
    }

    public void setAxleMass(int axleMass) {
        this.axleMass = axleMass;
    }
}
