package core.mate.academy.model;

public class Truck extends Machine {
    private int truckCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int truckCapacity) {
        setName(name);
        setColor(color);
        this.truckCapacity = truckCapacity;
    }

    public int getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
