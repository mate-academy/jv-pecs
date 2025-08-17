package core.mate.academy.model;

public class Truck extends Machine {
    private double truckCapacity;

    public Truck() {
    }

    public Truck(String name, String color, double truckCapacity) {
        setName(name);
        setColor(color);
        this.truckCapacity = truckCapacity;
    }

    public double getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(double truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
