package core.mate.academy.model;

public class Truck extends Machine {
    private int lorryCapacity;

    public Truck() {
    }

    public Truck(int lorryCapacity) {
        this.lorryCapacity = lorryCapacity;
    }

    public int getLorryCapacity() {
        return lorryCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
