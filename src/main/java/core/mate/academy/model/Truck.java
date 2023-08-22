package core.mate.academy.model;

public class Truck extends Machine {
    private int maxSpeed;
    private int wheels;

    public Truck() {
    }

    public Truck(String name, String color, int maxSpeed, int wheels) {
        super(name, color);
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
