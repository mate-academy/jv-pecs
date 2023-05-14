package core.mate.academy.model;

public class Truck extends Machine {
    private double capacityInTon;
    private boolean hasDumpTruck;

    public Truck() {
    }

    public Truck(double capacityInTon, boolean hasDumpTruck) {
        this.capacityInTon = capacityInTon;
        this.hasDumpTruck = hasDumpTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
