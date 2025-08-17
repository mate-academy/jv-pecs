package core.mate.academy.model;

public class Truck extends Machine {
    private double bodyVolume;
    private boolean isTrailerCovered;

    public Truck() {
    }

    public Truck(boolean isTrailerCovered, double bodyVolume) {
        this.isTrailerCovered = isTrailerCovered;
        this.bodyVolume = bodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
