package core.mate.academy.model;

public class Truck extends Machine {
    private double loadWeight;
    private double avgSpeed;

    public Truck() {
    }

    public Truck(double loadWeight, double avgSpeed) {
        this.loadWeight = loadWeight;
        this.avgSpeed = avgSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
