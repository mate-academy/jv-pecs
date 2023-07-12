package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyTypes;
    private double wheelBase;

    public Truck() {
    }

    public Truck(String bodyTypes, double wheelBase) {
        this.bodyTypes = bodyTypes;
        this.wheelBase = wheelBase;
    }

    public String getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public double getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(double wheelBase) {
        this.wheelBase = wheelBase;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
