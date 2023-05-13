package core.mate.academy.model;

public class Truck extends Machine {
    private double payload;

    public Truck(String name, String color, double payload) {
        super(name, color);
        this.payload = payload;
    }

    public Truck() {
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
