package core.mate.academy.model;

public class Truck extends Machine {
    private int maxWeight;

    public Truck(String name, String color, int truckYear) {
        super(name, color);
        this.maxWeight = truckYear;
    }

    public Truck() {
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
