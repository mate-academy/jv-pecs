package core.mate.academy.model;

public class Truck extends Machine {
    private double payloadCapacity;
    private double kerbWeight;

    public Truck(String name, String color, double payloadCapacity, double kerbWeight) {
        super(name, color);
        this.payloadCapacity = payloadCapacity;
        this.kerbWeight = kerbWeight;
    }

    public Truck() {
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setKerbWeight(double kerbWeight) {
        this.kerbWeight = kerbWeight;
    }

    public double getKerbWeight() {
        return kerbWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
