package core.mate.academy.model;

public class Truck extends Machine {
    private int speed;

    public Truck() {
    }

    public Truck(String name, String color, int speed) {
        super(name, color);
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
