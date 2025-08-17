package core.mate.academy.model;

public class Truck extends Machine {
    private double payloadCapacity;

    public Truck() {

    }

    public Truck(String name, String color, double payloadCapacity) {
        super(name, color);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
