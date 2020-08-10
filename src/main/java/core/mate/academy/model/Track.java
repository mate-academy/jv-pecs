package core.mate.academy.model;

public class Track extends Machine {
    private double avgPressureInWheels;
    private int maxTransportationWeight;

    public Track() {
    }

    public Track(double avgPressureInWheels, int maxTransportationWeight) {
        this.avgPressureInWheels = avgPressureInWheels;
        this.maxTransportationWeight = maxTransportationWeight;
    }

    public double getAvgPressureInWheels() {
        return avgPressureInWheels;
    }

    public void setAvgPressureInWheels(int avgPressureInWheels) {
        this.avgPressureInWheels = avgPressureInWheels;
    }

    public int getMaxTransportationWeight() {
        return maxTransportationWeight;
    }

    public void setMaxTransportationWeight(int maxTransportationWeight) {
        this.maxTransportationWeight = maxTransportationWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
