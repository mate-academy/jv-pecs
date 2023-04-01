package core.mate.academy.model;

public class Truck extends Machine {
    private int wheelSize;

    public Truck() {
    }

    public Truck(String name, String color, int wheelSize) {
        super(name, color);
        this.wheelSize = wheelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
