package core.mate.academy.model;

public class Truck extends Machine {
    private int maxCargoWeight;

    public Truck() {

    }

    public Truck(String model, String name, String color, int maxCargoWeight) {
        super(model, name, color);
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
