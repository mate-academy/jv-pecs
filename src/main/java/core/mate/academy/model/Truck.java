package core.mate.academy.model;

public class Truck extends Machine {
    private int numberOfPassenger;
    private double trunkVolume;

    public Truck() {
    }

    public Truck(int numberOfPassenger, double trunkVolume) {
        this.numberOfPassenger = numberOfPassenger;
        this.trunkVolume = trunkVolume;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public double getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(double trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
