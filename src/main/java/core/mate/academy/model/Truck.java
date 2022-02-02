package core.mate.academy.model;

public class Truck extends Machine {
    private double bodyVolume;

    public Truck() {
    }

    public double getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
