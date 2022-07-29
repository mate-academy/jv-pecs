package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int numberOfAxles;
    private double carryingCapacity;

    public Truck() {
    }

    private Truck(String name, String color, int maxSpeed,
                  int numberOfAxles, double carryingCapacity) {
        super(name, color);
        this.maxSpeed = maxSpeed;
        this.numberOfAxles = numberOfAxles;
        this.carryingCapacity = carryingCapacity;
    }

    public static Truck create(String name, String color, int maxSpeed,
                          int numberOfAxles, double carryingCapacity) {
        return new Truck(name, color, maxSpeed, numberOfAxles, carryingCapacity);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
