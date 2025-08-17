package core.mate.academy.model;

public class Truck extends Machine {
    private int maxLoadedWeight;
    private int horsePower;

    public Truck() {
    }

    public Truck(String name, String color, int maxLoadedWeight, int horsePower) {
        super(name, color);
        this.maxLoadedWeight = maxLoadedWeight;
        this.horsePower = horsePower;
    }

    public int getMaxLoadedWeight() {
        return maxLoadedWeight;
    }

    public void setMaxLoadedWeight(int maxLoadedWeight) {
        this.maxLoadedWeight = maxLoadedWeight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
