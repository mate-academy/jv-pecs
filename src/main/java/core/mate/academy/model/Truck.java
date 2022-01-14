package core.mate.academy.model;

public class Truck extends Machine {
    private String typeFrame;
    private double payload;
    private double struck;
    private double maxSpeed;

    public Truck() {
    }

    public Truck(String name, String color, String typeFrame, double payload,
                 double struck, double maxSpeed) {
        super(name, color);
        this.typeFrame = typeFrame;
        this.payload = payload;
        this.struck = struck;
        this.maxSpeed = maxSpeed;
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    public String getFrame() {
        return typeFrame;
    }

    public void setFrame(String typeFrame) {
        this.typeFrame = typeFrame;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getStruck() {
        return struck;
    }

    public void setStruck(double struck) {
        this.struck = struck;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
