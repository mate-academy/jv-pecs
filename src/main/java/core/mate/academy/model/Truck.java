package core.mate.academy.model;

public class Truck extends Machine {
    private final String truckModel;
    private final int maxCargoWeight;

    public Truck() {
        this.truckModel = "Model Three";
        this.maxCargoWeight = 2000;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
