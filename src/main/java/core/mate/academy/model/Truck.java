package core.mate.academy.model;

public class Truck extends Machine {
    private int capacity;

    public Truck() {
    }

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
