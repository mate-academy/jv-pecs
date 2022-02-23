package core.mate.academy.model;

public class Truck extends Machine {
    private double weight;

    public Truck() {
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
