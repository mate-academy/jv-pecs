package core.mate.academy.model;

public class Truck extends Machine {
    private double capacity;

    public Truck() {
    }

    public Truck(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
