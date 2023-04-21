package core.mate.academy.model;

public class Truck extends Machine {
    private int payloadCapacity;
    private int fuelCapacity;

    public Truck() {
        super("default_name", "default_color");
    }

    public Truck(String name, String color, int payloadCapacity, int fuelCapacity) {
        super(name, color);
        this.payloadCapacity = payloadCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
