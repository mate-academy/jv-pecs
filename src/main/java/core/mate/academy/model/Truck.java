package core.mate.academy.model;

public class Truck extends Machine {
    private double weight;

    public Truck() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
