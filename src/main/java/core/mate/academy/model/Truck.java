package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double payload;

    public Truck() {
    }

    public Truck(String name, String color, double payload) {
        setName(name);
        setColor(color);
        this.payload = payload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
