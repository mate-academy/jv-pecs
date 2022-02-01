package core.mate.academy.model;

public class Truck extends Machine {
    private double bodyVolume;

    public Truck() {
    }

    public Truck(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
