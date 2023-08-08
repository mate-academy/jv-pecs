package core.mate.academy.model;

public class Truck extends Machine {
    public Truck() {
    }

    public Truck(String name, String color, int horsePower) {
        super(name, color, horsePower);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
