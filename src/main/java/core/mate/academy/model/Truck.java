package core.mate.academy.model;

public class Truck extends Machine {
    private boolean isEmpty;

    public Truck() {
    }

    public Truck(String name, String color, boolean isEmpty) {
        super(name, color);
        this.isEmpty = isEmpty;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
