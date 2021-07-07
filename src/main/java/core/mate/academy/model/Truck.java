package core.mate.academy.model;

public class Truck extends Machine {

    private int calculateWheels;

    public Truck() {
    }

    public Truck(String name, String color, int calculateWheels) {
        super(name, color);
        this.calculateWheels = calculateWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
