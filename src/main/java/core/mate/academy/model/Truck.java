package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String model, int loadCapacity) {
        this.model = model;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
