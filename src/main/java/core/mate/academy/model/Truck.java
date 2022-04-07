package core.mate.academy.model;

public class Truck extends Machine {
    private int maxWeight;

    public Truck(int maxWeight, String name, String color) {
        super(name, color);
        this.maxWeight = maxWeight;
    }

    public Truck() {
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
