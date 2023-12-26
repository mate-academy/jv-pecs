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

    public double getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    public boolean isTrailerCovered() {
        return isTrailerCovered;
    }

    public void setTrailerCovered(boolean trailerCovered) {
        isTrailerCovered = trailerCovered;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
