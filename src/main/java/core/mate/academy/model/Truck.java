package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private int maxCargoWeight;

    public Truck() {

    }

    public Truck(String model, int maxCargoWeight) {
        this.model = model;
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
