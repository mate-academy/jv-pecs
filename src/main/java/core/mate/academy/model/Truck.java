package core.mate.academy.model;

public class Truck extends Machine {
    private int numberOfAxles;
    private int length;

    public Truck() {
    }

    public Truck(int numberOfAxles, int length, String name, String color) {
        this.numberOfAxles = numberOfAxles;
        this.length = length;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
