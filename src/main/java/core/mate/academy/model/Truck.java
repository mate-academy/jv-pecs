package core.mate.academy.model;

public class Truck extends Machine {
    private double maxLoad;
    private int maxSpeed;

    public Truck(double maxLoad, int maxSpeed, String name, String color) {
        super(name, color);
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }

    public Truck() {
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
