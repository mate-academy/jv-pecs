package core.mate.academy.model;

public class Truck extends Machine {
    private int capacity;

    public Truck() {
    }

    public Truck(String name, String color, int capacity) {
        super(name, color);
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
