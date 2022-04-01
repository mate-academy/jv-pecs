package core.mate.academy.model;

public class Truck extends Machine {
    private int weightCapacity;

    public Truck() {
    }

    public Truck(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
