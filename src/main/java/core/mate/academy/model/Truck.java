package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private double bodyCapacity;
    private int wheelCount;
    private String wheelFormula;

    public Truck(double loadCapacity, double bodyCapacity, int wheelCount, String wheelFormula) {
        this.loadCapacity = loadCapacity;
        this.bodyCapacity = bodyCapacity;
        this.wheelCount = wheelCount;
        this.wheelFormula = wheelFormula;
    }

    public Truck() {
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getBodyCapacity() {
        return bodyCapacity;
    }

    public void setBodyCapacity(double bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getWheelFormula() {
        return wheelFormula;
    }

    public void setWheelFormula(String wheelFormula) {
        this.wheelFormula = wheelFormula;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
