package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double agronomicGap;
    private double minimumTurningRadius;
    private double hydraulicLoadCapacity;

    public Truck() {
    }

    public Truck(double agronomicGap, double minimumTurningRadius, double hydraulicLoadCapacity) {
        this.agronomicGap = agronomicGap;
        this.minimumTurningRadius = minimumTurningRadius;
        this.hydraulicLoadCapacity = hydraulicLoadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
