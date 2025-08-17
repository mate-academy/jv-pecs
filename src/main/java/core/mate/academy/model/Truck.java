package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;

    public Truck() {
    }

    public Truck(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{loadCapacity=" + loadCapacity + "}";
    }
}
