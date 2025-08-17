package core.mate.academy.model;

public class Truck extends Machine {
    private int payload;
    private int chassisLength;

    public Truck() {
    }

    public Truck(String name, String color, int payload, int chassisLength) {
        super(name, color);
        this.payload = payload;
        this.chassisLength = chassisLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
