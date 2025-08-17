package core.mate.academy.model;

public class Truck extends Machine {
    private int maxSpeed;

    public Truck() {
    }

    public Truck(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Truck(String name, String color, int maxSpeed) {
        super(name, color);
        this.maxSpeed = maxSpeed;
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
