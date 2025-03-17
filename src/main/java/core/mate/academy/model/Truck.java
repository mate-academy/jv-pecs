package core.mate.academy.model;

public class Truck extends Machine {
    private int trailerLength;

    public Truck() {
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
