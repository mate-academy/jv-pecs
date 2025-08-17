package core.mate.academy.model;

public class Truck extends Machine {
    private int weight;

    public Truck() {
    }

    public Truck(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int horsePower) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
