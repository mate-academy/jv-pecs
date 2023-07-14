package core.mate.academy.model;

public class Truck extends Machine {
    private double engineDisplacement;
    private double maximumPower;
    private double weight;

    public Truck() {
    }

    public Truck(double engineDisplacement, double maximumPower, double weight) {
        this.engineDisplacement = engineDisplacement;
        this.maximumPower = maximumPower;
        this.weight = weight;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public double getMaximumPower() {
        return maximumPower;
    }

    public void setMaximumPower(double maximumPower) {
        this.maximumPower = maximumPower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{"
                + "engineDisplacement=" + engineDisplacement
                + ", maximumPower=" + maximumPower
                + ", weight=" + weight + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
