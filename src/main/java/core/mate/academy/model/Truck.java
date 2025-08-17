package core.mate.academy.model;

public class Truck extends Machine {
    private int maxWeight;
    private int rangeTruck;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getRangeTruck() {
        return rangeTruck;
    }

    public void setRangeTruck(int rangeTruck) {
        this.rangeTruck = rangeTruck;
    }
}
