package core.mate.academy.model;

public class Truck extends Machine {
    private int maxCapacity;

    public Truck() {
        super();
    }

    public Truck(String color, String name, int maxCapacity) {
        super(color, name);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
