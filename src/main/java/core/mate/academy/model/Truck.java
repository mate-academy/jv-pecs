package core.mate.academy.model;

public class Truck extends Machine {
    private double amountOfWheels;

    public Truck(String name, String color, double amountOfWheels) {
        super(name, color);
        this.amountOfWheels = amountOfWheels;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
