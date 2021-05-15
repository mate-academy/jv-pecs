package core.mate.academy.model;

public class Truck extends Machine {
    private boolean hasContainer;
    private int sizeOfTruck;

    public Truck() {
    }

    public Truck(boolean hasContainer, int sizeOfTruck) {
        this.hasContainer = hasContainer;
        this.sizeOfTruck = sizeOfTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
