package core.mate.academy.model;

public class Truck extends Machine {
    private int power;

    public Truck() {
    }

    public Truck(String name, String color, int power) {
        setName(name);
        setColor(color);
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
